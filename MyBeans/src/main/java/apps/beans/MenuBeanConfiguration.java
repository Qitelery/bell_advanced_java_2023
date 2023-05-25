package apps.beans;

import lombok.*;
import org.springframework.stereotype.Component;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class MenuBeanConfiguration {
    private String music = "1 - Послушать музыку";
    private String film = "2 - Посмотреть фильм";
    private String game = "3 - Поиграть в игру";
}