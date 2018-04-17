package com.webfulx.article.demo.router;

import com.webfulx.article.demo.handler.articleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
public class articleRouter {
    @Bean
    public RouterFunction<ServerResponse> routeArticle(articleHandler articleHandler){
        RouterFunction<ServerResponse> router =  RouterFunctions.route(GET("/hello"),articleHandler::helloWorld)
                .andRoute(GET("/"),articleHandler::helloWorld)
                .andRoute(POST("/post"),articleHandler::helloWorld);
        return router;
    }
}
