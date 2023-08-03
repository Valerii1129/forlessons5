package hillel.json1.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.json1.model.animal.Animal;

public class Start {
    public static void main(String[] args) {
        final Animal dog = new Animal("sharik", "2009.02.12", 14, false, "buldog");

        final AnimalSerializer<JsonMapper> animalSerializer = new AnimalSerializer<>(new JsonMapper());
        animalSerializer.serialize(dog);

        final AnimalSerializer<XmlMapper> animalSerializer2 = new AnimalSerializer<>(new XmlMapper());
        animalSerializer2.serialize(dog);

        final AnimalSerializer<YAMLMapper> animalSerializer3 = new AnimalSerializer<>(new YAMLMapper());
        animalSerializer3.serialize(dog);
    }
}