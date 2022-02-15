package com.study.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 35612
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Secured("{PRODUCT}")
    @RequestMapping("/findAll")
    public String findAll() {
        return "product-list";
    }
}
