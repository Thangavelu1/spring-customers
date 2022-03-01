package com.hexaware.services;

import java.util.List;

import com.hexaware.entities.Customer;

public interface CustomerService {

    public abstract Customer addCustomer(Customer customer);
    public abstract Customer getCustomer(Long id);
    public abstract List<Customer> getCustomerbyEmail(String email);
    public abstract List<Customer> allCustomer();
    public abstract Customer updateCustomer(Long id, Customer customer);
    public abstract void deleteCustomer(Long id);
}
