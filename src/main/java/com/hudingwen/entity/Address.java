package com.hudingwen.entity;

/**
 * ClassName:Address
 * Package:com.hudingwen.entity
 * Description:描述
 * Date:2022-10-04 13:57:20
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
public class Address {
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String city;
    public String province;
}
