package com.vic.starter.demo.controller;


import com.vicframework.web.model.RestResponse;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.vic.starter.demo.service.ISurveyService;
import com.vic.starter.demo.entity.Survey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vic
 * @since 2020-02-10
 */
@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private ISurveyService iSurveyService;

    @GetMapping("/surveys")
    public List<Survey> getSurveys() {
        List<Survey> result = iSurveyService.list();
        return result;
    }

    @PostMapping("/surveys")
    public RestResponse getSurveys(@RequestBody Survey survey) {
        boolean result = iSurveyService.save(survey);
        return RestResponse.success(null);
    }

    @GetMapping("/surveys/{id}")
    public Survey one(@PathVariable Long id) {
        return iSurveyService.getById(id);
    }

    @DeleteMapping("/surveys/{id}")
    public RestResponse deleteSurvey(@PathVariable Long id) {
        boolean result = iSurveyService.removeById(id);
        return RestResponse.success(null);
    }

}

