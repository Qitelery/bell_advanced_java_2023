package service.template;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String name;
    int age;
    String profession;
}
