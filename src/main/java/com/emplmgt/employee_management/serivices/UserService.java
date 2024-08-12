package com.emplmgt.employee_management.serivices;

import com.emplmgt.employee_management.dto.UserDTO;
import com.emplmgt.employee_management.entities.UserEntity;
import com.emplmgt.employee_management.mappers.UserMapper;
import com.emplmgt.employee_management.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity = UserMapper.toEntity(userDTO);
        UserEntity savedData = userRepository.save(userEntity);
        return UserMapper.toDTO(savedData);
    }

    public UserDTO getUser(Long id) {
        try {
            UserEntity data = userRepository.getById(id);
            return UserMapper.toDTO(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<UserDTO> getUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UserDTO updateUser (UserDTO userDTO) {
        try {
            UserEntity existingUser = userRepository.findById(userDTO.getId())
                    .orElseThrow(() -> new IllegalArgumentException("User not found with name: " + userDTO.getName()));

            existingUser.setUserName(userDTO.getUserName());
            existingUser.setEmail(userDTO.getEmail());
            existingUser.setName(userDTO.getName());
            existingUser.setActive(userDTO.isActive());

            UserEntity updatedUser = userRepository.save(existingUser);

            return UserMapper.toDTO(updatedUser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteUser(Long userId) {
        UserEntity existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + userId));

        userRepository.delete(existingUser);

        return !userRepository.existsById(userId);
    }


}
