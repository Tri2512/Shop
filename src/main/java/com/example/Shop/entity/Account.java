package com.example.Shop.entity;

import java.util.Date;

public class Account {
    //ma tai khoan
    private int id;
    //ten tai khoan
    private String accountName;
    //mat khau
    private String password;
    //ho ten chu tai khoan
    private String fullName;
    //ngay sinh
    private Date birthday;
    //so dien thoai
    private String phone;
    //dia chi
    private String address;
    //vai tro
    private Role role;

    public Account(int id, String accountName, String password, String fullName, Date birthday, String phone, String address, Role role) {
        this.id = id;
        this.accountName = accountName;
        this.password = password;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
