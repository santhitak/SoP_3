package com.example.lab03service;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private final List<Customer> customers;

    public CustomerController(){
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer("1010","John", "male", 25));
        this.customers.add(new Customer("1018","Peter", "male", 24));
        this.customers.add(new Customer("1019","Sarah", "female", 23));
        this.customers.add(new Customer("1110","Rose", "female", 23));
        this.customers.add(new Customer("1001","Emma", "female", 20));
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return customers;
    }

    @RequestMapping(value = "/customerbyid/{ID}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable String ID){
        for (Customer item: customers) {
            if(item.getID().equals(ID)) return item;
        }
        return null;
    }

    @RequestMapping(value = "/customerbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable String n){
        for (Customer item: customers) {
            if(item.getName().equals(n)) return item;
        }
        return null;
    }

    @RequestMapping(value = "/customerDelById/{ID}")
    public boolean delCustomerByID(@PathVariable String ID){
        return customers.removeIf(obj -> obj.getID().equals(ID));
    }

    @RequestMapping(value = "/customerDelByName/{n}")
    public boolean delCustomerByName(@PathVariable String n){
        return customers.removeIf(obj -> obj.getName().equals(n));
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam String ID, @RequestParam String n,@RequestParam String s,@RequestParam int a){
        return this.customers.add(new Customer(ID,n, s, a));
    }

    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam String ID, @RequestParam String n,@RequestParam String s,@RequestParam int a){
        return this.customers.add(new Customer(ID,n, s, a));
    }
}
