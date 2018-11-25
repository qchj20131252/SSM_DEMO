package com.kelab.controller;

import com.kelab.pojo.Customer;
import com.kelab.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id, Model model){
        Customer customer = this.customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }

    @RequestMapping("/toTest")
    public String toTest(){
        return "test";
    }
}
