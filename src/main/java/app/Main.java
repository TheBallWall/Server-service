package app;

import app.service.ServerResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    @Autowired
    static
    ServerResponseService serverResponseService = new ServerResponseService();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Hello, World!");
        System.out.println();
        //serverResponseService.conductOperation("A",3000,true);
    }
}