package lk.group.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    int requestC = 0;

    String container;

    @GetMapping(path = "/")
    public String helloWorld(@RequestParam("name") String param1) {


        requestC++;

        if (container == null || container.equals("")) {
            UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();

            container= randomUUIDString;
        }

        System.out.println("first time container "+container);

        return requestC + " Container " + container;
    }
}
