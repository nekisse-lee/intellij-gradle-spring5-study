package com.example.springbootdemo.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.OffsetDateTime;

public class Now {
@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private OffsetDateTime time;


    public Now() {
        this.time = OffsetDateTime.now();
    }

    public OffsetDateTime getTime() {
        return time;

    }

}
