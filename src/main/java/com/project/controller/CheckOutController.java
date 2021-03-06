package com.project.controller;

import com.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CheckOutController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void checkout() {
        cartService.cleanCart();
    }
}
