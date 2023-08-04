package hillel.json1.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.json1.model.animal.Animal;

public class Start {
    public static void main(String[] args) {

        final Animal dog = new Animal("sharik", "2009.02.12", 14, false, "buldog");

        final hillel.json1.service.AnimalForAllTypeSerializer<JsonMapper> animalSerializer1 = new hillel.json1.service.AnimalForAllTypeSerializer<>(new JsonMapper());
        animalSerializer1.serialize(dog);
        final hillel.json1.service.AnimalForAllTypeSerializer<YAMLMapper> animalSerializer2 = new hillel.json1.service.AnimalForAllTypeSerializer<>(new YAMLMapper());
        animalSerializer2.serialize(dog);
        final hillel.json1.service.AnimalForAllTypeSerializer<XmlMapper> animalSerializer3 = new hillel.json1.service.AnimalForAllTypeSerializer<>(new XmlMapper());
        animalSerializer3.serialize(dog);
    }
}