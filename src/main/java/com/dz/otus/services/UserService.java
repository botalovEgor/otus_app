package com.dz.otus.services;

import com.dz.otus.models.UserEntity;
import com.dz.otus.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserEntity getUser(Long userId){
        return repository.findById(userId).orElse(new UserEntity());
    }

    public void createUser(UserEntity user){
        repository.save(user);
    }

    public void updateUser(UserEntity user){
        repository.save(user);
    }

    public void deleteUser(Long userId){
        repository.deleteById(userId);
    }
}
