package BasicAuthenticator.com.controller;

import BasicAuthenticator.com.Entity.User;
import BasicAuthenticator.com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {

              return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        return userService.auth(user);
    }


}
