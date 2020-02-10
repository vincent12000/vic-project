package com.vic.starter.demo.service.impl;

import com.vic.starter.demo.entity.Survey;
import com.vic.starter.demo.mapper.SurveyMapper;
import com.vic.starter.demo.service.ISurveyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vic
 * @since 2020-02-10
 */
@Service
public class SurveyServiceImpl extends ServiceImpl<SurveyMapper, Survey> implements ISurveyService {

}
