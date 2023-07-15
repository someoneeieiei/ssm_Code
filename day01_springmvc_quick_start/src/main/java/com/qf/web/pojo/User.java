package com.qf.web.pojo;

import java.util.Date;
import java.util.Map;

public class User {
    private int id;
    private String username;
    private String password;
    private String address;
    private Date birthday;
    private Role role;
    private Map<String,Role> roleMap;

    public User() {
    }

    public User(int id, String username, String password, String address, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
    }

    public User(int id, String username, String password, String address, Date birthday, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.role = role;
    }

    public User(int id, String username, String password, String address, Date birthday, Role role, Map<String, Role> roleMap) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.role = role;
        this.roleMap = roleMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Map<String, Role> getRoleMap() {
        return roleMap;
    }

    public void setRoleMap(Map<String, Role> roleMap) {
        this.roleMap = roleMap;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", role=" + role +
                ", roleMap=" + roleMap +
                '}';
    }
}
