package com.dz.otus.contoller;

import com.dz.otus.models.UserEntity;
import com.dz.otus.services.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping
    public void createUser(@RequestBody UserEntity user){
        service.createUser(user);
    }

    @GetMapping("/{userId}")
    public UserEntity getUSer(@PathVariable Long userId){
        return service.getUser(userId);
    }

    @PutMapping("/{userId}")
    public void updateUSer(@RequestBody UserEntity user,  @PathVariable Long userId){
        user.setId(userId);
        service.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public HttpEntity deleteUSer(@PathVariable Long userId){
        service.deleteUser(userId);
        return ResponseEntity.status(204).build();
    }
}
