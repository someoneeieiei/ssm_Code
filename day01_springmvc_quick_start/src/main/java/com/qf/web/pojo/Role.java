package com.qf.web.pojo;

import java.util.List;

public class Role {
    private int id;
    private String roleName;
    private String roleDesc;
    private List<User> userList;

    public Role() {
    }

    public Role(int id, String roleName, String roleDesc) {
        this.id = id;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public Role(int id, String roleName, String roleDesc, List<User> userList) {
        this.id = id;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.userList = userList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", userList=" + userList +
                '}';
    }
}
