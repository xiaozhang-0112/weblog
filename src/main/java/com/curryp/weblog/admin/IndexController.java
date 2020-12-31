package com.curryp.weblog.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pu.zhang
 * @version 1.0
 * @description: TODO
 * @date 2020/12/31 14:44
 */

@Controller
@RequestMapping("/admin")
public class IndexController {

    @GetMapping
    public String index(){

        return "/admin/login";
    }

    @PostMapping("/login")
    public String login(String uname, String password) {

        return "/admin/index";
    }
}
