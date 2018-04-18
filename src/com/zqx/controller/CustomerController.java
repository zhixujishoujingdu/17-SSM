package com.zqx.controller;

import com.zqx.po.Customer;
import com.zqx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 根据ID查询用户信息
     */
    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id, Model model){
        Customer customer=customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }
}
