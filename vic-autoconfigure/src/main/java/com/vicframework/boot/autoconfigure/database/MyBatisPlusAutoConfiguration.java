package com.vicframework.boot.autoconfigure.database;

import com.vicframework.database.common.VicMyBatisPlusProperties;
import com.vicframework.database.config.MyBatisPlusConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(VicMyBatisPlusProperties.class)
@Slf4j
public class MyBatisPlusAutoConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "vic.database.mybatis", name = "mapper-scan-path", matchIfMissing = false)
    public MyBatisPlusConfig myBatisPlusConfig(VicMyBatisPlusProperties properties) {
        log.info("+++++++++++++");
        log.info(properties.getMapperScanPath());
        MyBatisPlusConfig myBatisPlusConfig = new MyBatisPlusConfig(properties);
        return myBatisPlusConfig;
    }

}
