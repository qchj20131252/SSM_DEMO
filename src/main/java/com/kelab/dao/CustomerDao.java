package com.kelab.dao;

import com.kelab.pojo.Customer;

public interface CustomerDao {
    /**
     * 根据id查询客户信息
     * @param id
     * @return
     */
    public Customer findCustomerById(Integer id);
}
