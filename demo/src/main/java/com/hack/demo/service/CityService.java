package com.hack.demo.service;

import com.hack.demo.domain.City;

import java.util.List;

public interface CityService {

    List<City> cities();

    City findCityByName(String cityName);
}
