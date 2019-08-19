/**
 * Company
 * Copyright (C) 2019-2019 All Rights Reserved.
 */
package cn.linfenw.linfen_blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linfen
 * 2019-08-19 20:13
 */
@RestController
public class HelloController {

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin!";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user!";
    }

    @GetMapping("/db/hello")
    public String db() {
        return "hello db!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
