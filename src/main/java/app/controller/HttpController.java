package app.controller;

import app.service.ServerResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("http")
public class HttpController {
    WebClient client = WebClient.create();

    @Autowired
    ServerResponseService serverResponseService = new ServerResponseService();

    @GetMapping("/getResponse")
    public String getResponse(){

        return serverResponseService.conductOperation("HTTP", 2000, true)?"success":"fail" + "\tfrom 8080";
    }

    @GetMapping("/sendRequest")
    public Mono<String> sendRequest(){
        String uri = "http://localhost:8081/http/getResponse";
        //return "I was sent from 8080!";
        return client.get().uri(uri).retrieve().bodyToMono(String.class);
    }
}
