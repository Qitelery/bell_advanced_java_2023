package core.models;

import lombok.*;

@Builder
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    String type;
    String name;
    int age;
}
