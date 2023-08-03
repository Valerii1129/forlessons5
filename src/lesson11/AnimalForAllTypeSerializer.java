package hillel.json1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.json1.enums.Extension;
import hillel.json1.model.animal.Animal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalForAllTypeSerializer<T extends ObjectMapper> {
    final T MAPERFORMAT;
    final File path;

    public AnimalForAllTypeSerializer(T MAPERFORMAT) {
        this.MAPERFORMAT = MAPERFORMAT;
        Extension extension = Extension.TXT;
        if (MAPERFORMAT instanceof JsonMapper) extension = Extension.JSON;
        if (MAPERFORMAT instanceof XmlMapper) extension = Extension.XML;
        if (MAPERFORMAT instanceof YAMLMapper) extension = Extension.YAML;
        this.path = new File("src/main/resources/animal" + extension);
    }

    public void serialize(Animal animal) {
        try {
            MAPERFORMAT.writeValue(path, animal);
        } catch (IOException e) {
            System.out.println("Cannot create file");
            e.printStackTrace();
        }
    }

    public void serialize(List<Animal> animals) {
        try {
            MAPERFORMAT.writeValue(path, animals);
        } catch (IOException e) {
            System.out.println("Cannot create file");
            e.printStackTrace();
        }
    }
    public Optional<Animal> deserialize() {
        try {
            return Optional.of(MAPERFORMAT.readValue(path, Animal.class));
        } catch (IOException e) {
            System.out.println("cannot read file");
            e.printStackTrace();
            return Optional.empty();
        }
    }
}