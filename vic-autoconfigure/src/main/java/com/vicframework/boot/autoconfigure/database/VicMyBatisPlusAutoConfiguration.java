package com.vicframework.boot.autoconfigure.database;

import com.vicframework.database.common.VicMyBatisPlusProperties;
import com.vicframework.database.config.MyBatisPlusConfig;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@EnableConfigurationProperties(VicMyBatisPlusProperties.class)
@ConditionalOnClass(MyBatisPlusConfig.class)
//@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE + 10)
//@AutoConfigureBefore({ MapperScannerConfigurer.class})
@Slf4j
public class VicMyBatisPlusAutoConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "vic.database.mybatis", name = "mapper-scan-path", matchIfMissing = false)
    public MyBatisPlusConfig myBatisPlusConfig(VicMyBatisPlusProperties properties) {
        log.info("+++++++++++++"+properties.getMapperScanPath()+"+++++++++++++");
        MyBatisPlusConfig myBatisPlusConfig = new MyBatisPlusConfig(properties);
        return myBatisPlusConfig;
    }

}
