package com.thitiwas.example.elk.two.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObj {
    private String status;
    private String code;
    private String message;
    private Date timeStamp;
}
