package com.atguigu.springcloud.alibaba.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    @SentinelResource("dog")
    public void getDog() {

    }
}
