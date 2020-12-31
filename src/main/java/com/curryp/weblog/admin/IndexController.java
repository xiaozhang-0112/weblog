package com.curryp.weblog.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pu.zhang
 * @version 1.0
 * @description: TODO
 * @date 2020/12/31 14:44
 */

@Controller
public class IndexController {

    @GetMapping(value = {"/admin","/"})
    public String index(){

        return "/admin/login";
    }

}
