package com.marwinsDev.Spring_CRUD.services;
import com.marwinsDev.Spring_CRUD.models.User;
import com.marwinsDev.Spring_CRUD.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário de id " + id + " não encontrado.")
        );
        if (user.getName() != null) {
            existingUser.setName(user.getName());
        }

        if (user.getEmail() != null) {
            existingUser.setEmail(user.getEmail());
        }

        if (user.getPassword() != null) {
            existingUser.setPassword(user.getPassword());
        }

        if (user.getAge() != null) {
            existingUser.setAge(user.getAge());
        }
        return userRepository.save(existingUser);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User deleteUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            System.out.println("User with ID " + id + " not found.");
        }
        userRepository.delete(user);
        System.out.println("User with ID " + id + " has been deleted.");
        return user;
    }
}
