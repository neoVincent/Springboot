package com.hack.demo.dao;

import com.hack.demo.domain.City;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface CityDao {

    @Select("SELECT * FROM city")
    // 返回 Map 结果集
    @Results(id = "cityResult" , value = {
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    List<City> cities();


    @Select("SELECT * FROM city where city_name = #{cityName}")
    City findCityByName(String cityName);

}
