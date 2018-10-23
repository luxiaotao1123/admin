package com.t3.admin.web.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luxiaotao on 2018/10/23
 */
@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "hello world";
    }
}
