package com.SpringBoot.TestProject2.controller;



import com.SpringBoot.TestProject2.dto.MessageResponse;
import com.SpringBoot.TestProject2.dto.UserDto;
import com.SpringBoot.TestProject2.service.UserService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{userName}")
    public ResponseEntity<UserDto> getUser(@PathVariable(name = "userName") final String userName) {
        return ResponseEntity.ok(userService.get(userName));
    }

    @PostMapping("/add")
    public ResponseEntity<?> createUser(@RequestBody final UserDto userDTO)
            throws MethodArgumentNotValidException {
        if (userService.userNameExists(userDTO.getUsername())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userService.emailExists(userDTO.getEmail())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
        }

        userDTO.setRoles(Collections.singleton("user"));
        userService.create(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<Void> updateUser(@PathVariable(name = "userName") final String userName,
            @RequestBody @Valid final UserDto userDTO) {
        userService.update(userName, userDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{userName}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<Void> deleteUser(@PathVariable(name = "userName") final String userName) {
        userService.delete(userName);
        return ResponseEntity.noContent().build();
    }

}
