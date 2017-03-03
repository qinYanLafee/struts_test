package com.raycloud.bean;

/**
 * Created by 001117020015 on 2017/3/2.
 */
public class User {
    private  String name;
    private  String password;
    private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User() {

    }

    public User(String name, String password, String sex) {
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
