package core.controller;

import core.generator.AnimalGenerator;
import core.models.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stub")
public class Controller {

    @Autowired
    AnimalGenerator animalGenerator;

    @GetMapping("/zoo")
    public List<Animal> getZoo(@RequestParam int length) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            animals.add(
                    (Animal) animalGenerator.generate()
            );
        }
        return animals;
    }

    @PutMapping("/zoo/animal")
    public Animal zooAnimal(@RequestParam String type,@RequestParam String name,@RequestParam Integer age) {
        Animal animal = new Animal();
        animal.setType(type);
        animal.setName(name);
        animal.setAge(age);
        return animal;
    }

}
