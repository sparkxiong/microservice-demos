package com.tenxcloud.springcloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangshixiong
 * @date 2020-12-15 5:41 下午
 */
@FeignClient(value = "springcloud-demo-provider")
public interface HelloService {

    @GetMapping(value = "hello")
    String hello(@RequestParam(value = "msg") String msg);

}
