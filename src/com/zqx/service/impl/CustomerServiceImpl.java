package com.zqx.service.impl;

import com.zqx.dao.CustomerDao;
import com.zqx.po.Customer;
import com.zqx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service//服务层
@Transactional//针对增删改的spring事务管理，查询不需要
public class CustomerServiceImpl implements CustomerService {
    @Autowired//将CustomerDao接口对象注入到本类
    private CustomerDao customerDao;
    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
