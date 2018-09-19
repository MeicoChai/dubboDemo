package com.chai;

import com.chai.service.HelloService;

/**
 * @Author: minquan.chai@hand-china.com
 * @Modificd By:
 * @Date: Created in chai on 2018/9/19.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello world ......";
    }
}
