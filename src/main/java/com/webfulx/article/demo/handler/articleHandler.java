package com.webfulx.article.demo.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import com.webfulx.article.demo.repostiory.articleRepository;

@Component
public class articleHandler {
    @Autowired
    private articleRepository articleRepository;

    public articleHandler(articleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Mono<ServerResponse> helloWorld(ServerRequest request){
        return ServerResponse.ok().body(BodyInserters.fromObject(articleRepository.findByAuthorId(1)));
    }
}
