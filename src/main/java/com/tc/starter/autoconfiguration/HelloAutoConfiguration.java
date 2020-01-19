package com.tc.starter.autoconfiguration;

import com.tc.starter.HelloFormatTemplate;
import com.tc.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author taosh
 * @create 2020-01-16 14:41
 */
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {
    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor processor, HelloProperties properties){
        return new HelloFormatTemplate(processor, properties);
    }
}
