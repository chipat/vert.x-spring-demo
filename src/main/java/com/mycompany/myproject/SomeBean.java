package com.mycompany.myproject;

import org.springframework.stereotype.Component;
import org.vertx.spring.EventBusHandler;

/**
 * Created by Software Psychology
 * User: softpsy
 * Date: 10/3/13
 * Time: 2:53 PM
 */
@Component
public class SomeBean {
    @EventBusHandler("ping-address")
    public Object persistContent (Object payload){
        return "persist";
    }

}
