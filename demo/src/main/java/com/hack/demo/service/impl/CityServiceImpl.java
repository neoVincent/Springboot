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
    public int deleteByPrimaryKey(Integer id) {
        return cityDao.deleteByPrimaryKey(id);

    }

    @Override
    public int insert(City record) {
        return cityDao.insert(record);

    }

    @Override
    public int insertSelective(City record) {
        return cityDao.insertSelective(record);

    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityDao.selectByPrimaryKey(id);

    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityDao.updateByPrimaryKeySelective(record);

    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityDao.updateByPrimaryKey(record);

    }

    @Override
    public List<City> cities() {
        return cityDao.cities();
    }
}
