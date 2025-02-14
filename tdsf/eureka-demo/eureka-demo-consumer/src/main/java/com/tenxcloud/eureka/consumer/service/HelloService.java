/*
 * Licensed Materials - Property of tenxcloud.com
 * (C) Copyright 2021 TenxCloud. All Rights Reserved.
 */

package com.tenxcloud.eureka.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangshixiong
 * @date 2021-07-06 12:58 上午
 */
@FeignClient(value = "eureka-demo-provider")
public interface HelloService {
    @GetMapping("hello")
    String hello(@RequestParam(value = "msg") String msg);
}
