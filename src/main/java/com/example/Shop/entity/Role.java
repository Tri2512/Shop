package com.example.Shop.entity;

import java.util.List;

public class Role {
    //ma vai tro
    private int roleId;
    //ten vai tro
    private String roleName;
    private List<Account> accountlist;

    public Role(int roleId, String roleName, List<Account> accountlist) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.accountlist = accountlist;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setAccountlist(List<Account> accountlist) {
        this.accountlist = accountlist;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public List<Account> getAccountlist() {
        return accountlist;
    }
}
