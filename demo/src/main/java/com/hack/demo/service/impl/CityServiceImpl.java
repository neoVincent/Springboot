package com.hack.demo.service.impl;

import com.hack.demo.dao.CityDao;
import com.hack.demo.domain.City;
import com.hack.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityDao cityDao;


    @Override
    public List<City> cities() {
        return cityDao.cities();
    }

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findCityByName(cityName);
    }


}
