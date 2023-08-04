package hillel.json1.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.json1.model.animal.Animal;

public class Start {
    public static void main(String[] args) {

        final AnimalForAllTypeSerializer<JsonMapper> animalSerializer1 = new AnimalForAllTypeSerializer<>(new JsonMapper());
        animalSerializer1.serialize(dog);
        final AnimalForAllTypeSerializer<YAMLMapper> animalSerializer2 = new AnimalForAllTypeSerializer<>(new YAMLMapper());
        animalSerializer2.serialize(dog);
        final AnimalForAllTypeSerializer<XmlMapper> animalSerializer3 = new AnimalForAllTypeSerializer<>(new XmlMapper());
        animalSerializer3.serialize(dog);
    }
}