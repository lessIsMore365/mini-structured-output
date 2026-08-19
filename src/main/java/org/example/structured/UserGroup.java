package org.example.structured;


import java.util.List;

public class UserGroup {

    private String groupName;

    private List<User> users;

    public UserGroup() {
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUsers() {
        return users;
    }
}
