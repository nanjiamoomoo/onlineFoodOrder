package com.project.controller;

import com.project.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping(value = "/order/{menuItemId}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addMenuItemToCart(@PathVariable("menuItemId") Integer menuItemId) {
        orderItemService.addMenuItemToCart(menuItemId);
    }
}
