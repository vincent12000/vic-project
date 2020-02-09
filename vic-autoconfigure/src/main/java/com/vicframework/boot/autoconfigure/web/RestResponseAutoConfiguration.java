package com.vicframework.boot.autoconfigure.web;

import com.vicframework.web.config.RestResponseConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnClass(RestResponseConfig.class)
@Import(RestResponseConfig.class)
public class RestResponseAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(RestResponseConfig.class)
    public RestResponseConfig restResponseConfig() {
        return new RestResponseConfig();
    }

}
