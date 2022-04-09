package model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private String userName;
    private String passWord;
    private Set<Role> roleSet = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    public User(int id, String name, String userName, String passWord, Set<Role> roleSet) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }
}
