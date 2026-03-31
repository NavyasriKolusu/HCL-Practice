package com.codespace.easybasket.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import com.codespace.easybasket.dto.*;
import com.codespace.easybasket.model.User;
import com.codespace.easybasket.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public UserResponseDTO create(UserRequestDTO dto) {
        User user = new User(null, dto.getName(), dto.getEmail(), dto.getPassword());
        User saved = repo.save(user);
        return new UserResponseDTO(saved.getId(), saved.getName(), saved.getEmail());
    }

    public List<UserResponseDTO> getAll() {
        return repo.findAll().stream()
                .map(u -> new UserResponseDTO(u.getId(), u.getName(), u.getEmail()))
                .collect(Collectors.toList());
    }
}
