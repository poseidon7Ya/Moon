package com.moon.cloud.nacos.config;


import com.alibaba.cloud.nacos.ConditionalOnNacosDiscoveryEnabled;
import com.alibaba.cloud.nacos.ribbon.ConditionalOnRibbonNacos;
import com.alibaba.cloud.nacos.ribbon.NacosRibbonClientConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties
@ConditionalOnBean(SpringClientFactory.class)
@ConditionalOnRibbonNacos
@ConditionalOnNacosDiscoveryEnabled
@AutoConfigureAfter(RibbonAutoConfiguration.class)
@RibbonClients(defaultConfiguration = NacosRibbonClientConfiguration.class)
public class OwnRibbonNacosAutoConfiguration {
}
