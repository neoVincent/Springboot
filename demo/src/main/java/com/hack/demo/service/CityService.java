package com.hack.demo.service;

import com.hack.demo.domain.City;

import java.util.List;

public interface CityService {

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> cities();
}
