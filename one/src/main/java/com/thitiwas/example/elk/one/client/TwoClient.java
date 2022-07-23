package com.thitiwas.example.elk.one.client;


import com.thitiwas.example.elk.one.model.ResponseObj;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(
        url = "${api.two.endpoint}",
        value = "two-service")
public interface TwoClient {
    @GetMapping("/hello")
    public @ResponseBody ResponseEntity<ResponseObj> hello();
}
