package service.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import service.template.User;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Component
public class GnenerationArray {
    private ArrayList<User> users = new ArrayList<User>();
    public ArrayList<User> generate (){
        for (int i = 0; i < 3; i++){
            User user = new User();
            user.setName("Alexey"+ i);
            user.setAge(30+i);
            user.setProfession("Engineer");
            users.add(user);
        }
        return users;
    }
}
