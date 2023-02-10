package com.javarush.plugin.service;

import com.javarush.plugin.entity.User;
import com.javarush.plugin.repository.Repository;
import com.javarush.plugin.repository.UserRepository;

import java.util.Collection;
import java.util.Optional;

public enum UserService {

    USER_SERVICE;

    private final Repository<User> userRepository = new UserRepository();;


    public void create(User user) {
        userRepository.create(user);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> get(long id) {
        return Optional.ofNullable(userRepository.get(id));
    }

    public Optional<User> get(String login, String password) {
        User patternUser = User
                .builder()
                .login(login)
                .password(password)
                .build();
        return userRepository.find(patternUser).findAny();
    }
}
