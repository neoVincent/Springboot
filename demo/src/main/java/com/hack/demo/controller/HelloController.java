package com.hack.demo.controller;

import com.hack.demo.domain.City;
import com.hack.demo.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hello")
    public String index() {
        Logger log = LoggerFactory.getLogger(HelloController.class);
        log.info("========w==============");
        return "Hello World!!!";
    }

    @RequestMapping("/")
    public String indexImg(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

    @RequestMapping(value = "api/city", method = RequestMethod.POST, consumes="application/json")
    public String insertCityRecord(@RequestBody City record) {
        cityService.insert(record);
        return "index";

    }

    @RequestMapping(value = "api/cities", method = RequestMethod.GET)
    public List<City> cities() {
        return  cityService.cities();
    }

    @RequestMapping(value = "api/cityname", method = RequestMethod.GET)
    public City findCityNameById(@RequestParam(value = "id") Integer id) {
        return cityService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "api/updateCity")
    public String updateCity(@RequestBody City record) {
        cityService.updateByPrimaryKey(record);

        return "updateUser";
    }

}
