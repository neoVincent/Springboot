package com.hack.demo.controller;

import com.hack.demo.domain.City;
import com.hack.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!!!";
    }

    @RequestMapping("/")
    public String indexImg(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

    @RequestMapping(value = "api/cities", method = RequestMethod.GET)
    public List<City> cities() {
        return cityService.cities();
    }

    @RequestMapping(value="api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }
}
