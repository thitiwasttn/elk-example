package com.thitiwas.example.elk.one.controller;

import com.thitiwas.example.elk.one.client.TwoClient;
import com.thitiwas.example.elk.one.model.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

@Controller
@RequestMapping("/api")
@Slf4j
public class HelloController {

    private final TwoClient twoClient;

    @Autowired
    public HelloController(TwoClient twoClient) {
        this.twoClient = twoClient;
    }

    @GetMapping("/hello")
    public @ResponseBody ResponseEntity<ResponseObj> hello() {
        ResponseObj ret = ResponseObj.builder()
                .code(HttpStatus.OK.toString())
                .message("hello form one")
                .status("success")
                .timeStamp(Calendar.getInstance().getTime())
                .build();

        return ResponseEntity.ok(ret);
    }

    @GetMapping("/two-hello")
    public @ResponseBody ResponseEntity<ResponseObj> twoHello() {
        log.info("one-hello");
        return ResponseEntity.ok(twoClient.hello().getBody());
    }
}
