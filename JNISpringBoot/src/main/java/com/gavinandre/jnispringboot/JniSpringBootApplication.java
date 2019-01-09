package com.gavinandre.jnispringboot;

import com.gavinandre.jnispringboot.jni.NativeLib;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JniSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JniSpringBootApplication.class, args);
    }

    @RequestMapping("/")
    public String greeting() {
        String uuid = NativeLib.generateUUID();
        return "generateUUID: " + uuid;
    }

}

