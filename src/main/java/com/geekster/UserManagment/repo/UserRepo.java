package com.geekster.UserManagment.repo;

import com.geekster.UserManagment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class UserRepo {
    @Autowired
    private Map<Integer, User> userMap;

    public Map<Integer, User> getUserMap() {
        return userMap;
    }
}
