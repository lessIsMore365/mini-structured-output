package org.example.structured;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_name")
    private String name;

    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
