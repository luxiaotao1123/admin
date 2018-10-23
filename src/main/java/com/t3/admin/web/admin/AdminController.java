package com.t3.admin.web.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.ccclubs.ts.order.services.IovService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by luxiaotao on 2018/10/23
 */
@RestController
public class AdminController {

    @Reference
    private IovService iovService;

    @GetMapping("/admin")
    public String admin() throws IOException {
        return JSON.toJSONString(iovService.getRealTimeCarState("LJ8E3C1M3GB003969").getData());
    }
}
