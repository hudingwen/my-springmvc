package com.hudingwen.entity;

/**
 * ClassName:Book
 * Package:com.hudingwen.entity
 * Description:描述
 * Date:2022-10-05 16:44:00
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
