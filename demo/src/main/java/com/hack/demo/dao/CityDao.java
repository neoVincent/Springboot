package com.hack.demo.dao;

import com.hack.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityDao {

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(City record);

    int insertSelective( City record);

    City selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey( City record);

    List<City> cities();
}
