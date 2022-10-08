package dev.ifrs.interfaceadapters.user.controller;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import dev.ifrs.interfaceadapters.user.repository.Repository;
import dev.ifrs.model.User;
import dev.ifrs.usercase.user.UserCase;
import dev.ifrs.usercase.user.UserCaseInterface;

@RequestScoped
@Transactional
public class UserController implements UserControllerInterface {

    private UserCaseInterface uc;
    private Repository repo;

    public UserController() {
        this.uc = new UserCase();
        this.repo = new Repository();
    }

    @Override
    public User save(String name, String password) {

        User user = uc.save(name, password);
        return repo.save(user);
    }
}
