package com.hudingwen.entity;

/**
 * ClassName:User
 * Package:com.hudingwen.entity
 * Description:描述
 * Date:2022-10-04 13:56:00
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
public class User {
    public String Name;
    public int age;
    public Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
