package nhuquynh.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import nhuquynh.entity.UserInfo;
import nhuquynh.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/new")
    public String addUser(@RequestBody UserInfo userInfo) {
        return userService.addUser(userInfo);
    }
}
