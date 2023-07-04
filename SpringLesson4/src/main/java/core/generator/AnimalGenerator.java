package core.generator;

import core.models.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalGenerator implements Generator{
    private static int id = 0;
    @Override
    public Object generate() {
        id++;
        Animal animal = Animal.builder()
                .type(String.format("cat %d", id))
                .name(String.format("Barsik %d", id))
                .age((int) 1 + id)
                .build();
        return animal;
    }
}
