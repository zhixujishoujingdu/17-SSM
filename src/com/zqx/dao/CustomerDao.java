package com.zqx.dao;

import com.zqx.po.Customer;

/**
 * Customer接口文件
 */
public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
