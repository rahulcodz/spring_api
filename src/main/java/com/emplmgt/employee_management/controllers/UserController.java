package com.emplmgt.employee_management.controllers;

import com.emplmgt.employee_management.dto.UserDTO;
import com.emplmgt.employee_management.entities.UserEntity;
import com.emplmgt.employee_management.serivices.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO createUser(@Valid @RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @PutMapping
    public UserDTO updateUser(@Valid @RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteUser(@PathVariable("id") Long user_id) {
        return userService.deleteUser(user_id);
    }

    @GetMapping(path = "/{id}")
    public UserDTO getUser(@PathVariable("id") Long user_id){
        return userService.getUser(user_id);
    }

    @GetMapping
    public List<UserDTO> getUser() {
        return userService.getUsers();
    }
}
