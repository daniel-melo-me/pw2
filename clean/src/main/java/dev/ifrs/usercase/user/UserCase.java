package dev.ifrs.usercase.user;

import dev.ifrs.model.User;

public class UserCase implements UserCaseInterface {
    
    @Override
    public User save(String name, String password) {
        User user = null;

        if (password.length() >= 5) {
            user = new User();
            user.setName(name);
            user.setPassword(password);
        } else {
            throw new IllegalArgumentException();
        }

        return user;
    }
}
