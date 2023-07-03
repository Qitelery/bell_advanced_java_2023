package service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.data.GnenerationArray;
import service.template.User;

import java.util.ArrayList;

@RestController
@RequestMapping("/class")
public class GetController {

    @Autowired
    GnenerationArray genUsers;

    @GetMapping("/users")
    public ArrayList<User> getCustomers(){
        genUsers.generate();
        return genUsers.getUsers();
    }
}
