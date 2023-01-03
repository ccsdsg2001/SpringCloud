package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cc
 * @date 2023年01月03日 15:43
 */
@Configuration
public class GateWayConfig {

//    @Bean
//    public RouteLocator cutolocater(RouteLocatorBuilder routeLocatorBuilder){
//
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//        routes.route("path_route",
//                r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
//
//        return routes.build();
//
//    }
}
