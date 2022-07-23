package com.thitiwas.example.elk.two.controller;

import com.thitiwas.example.elk.two.model.ResponseObj;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/hello")
    public @ResponseBody ResponseEntity<ResponseObj> hello() throws IllegalAccessException {
        log.info("two-hello");
        ResponseObj ret = ResponseObj.builder()
                .code(HttpStatus.OK.toString())
                .message("hello form two")
                .status("success")
                .timeStamp(Calendar.getInstance().getTime())
                .build();
        // throw new IllegalAccessException();
        return ResponseEntity.ok(ret);
    }
}
