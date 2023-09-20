package com.aws.services.ecs.docker;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/JSON")
public class DockerController {

    @GetMapping(value="/EMP", produces = MediaType.APPLICATION_JSON_VALUE)
    public String read(){
        return "{  \n" +
                "    \"employee\": {  \n" +
                "        \"name\":       \"sonoo\",   \n" +
                "        \"salary\":      56000,   \n" +
                "        \"married\":    true  \n" +
                "    }  \n" +
                "} ";
    }

}
