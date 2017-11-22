package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    @Qualifier("cityServiceImpl11")
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "addCity", method = RequestMethod.POST)
    public void addCity(@RequestBody City city) {
        cityService.addCity(city);
        //System.out.println("####test");
    }

    @RequestMapping(value = "insertCity", method = RequestMethod.POST)
    public void addCity(@RequestBody Map<String, String> param) {
        String province = param.get("provinceId");
        Long provinceId = Long.parseLong(province);
        String cityName = param.get("cityName");
        String description = param.get("description");
        City city = new City();
        city.setProvinceId(provinceId);
        city.setCityName(cityName);
        city.setDescription(description);
        cityService.addCity(city);
        //System.out.println("####test");
    }

}
