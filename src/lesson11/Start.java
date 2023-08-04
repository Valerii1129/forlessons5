package hillel.json1.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class Start {
    public static void main(String[] args) {
        final Animal dog = new Animal("sharik", "2009.02.12", 14, false, "buldog");

        final AnimalForAllTypeSerializer<JsonMapper> animalSerializer1 = new AnimalForAllTypeSerializer<>(new JsonMapper());
        animalSerializer1.serialize(dog);
        final AnimalForAllTypeSerializer<YAMLMapper> animalSerializer2 = new AnimalForAllTypeSerializer<>(new YAMLMapper());
        animalSerializer2.serialize(dog);
        final AnimalForAllTypeSerializer<XmlMapper> animalSerializer3 = new AnimalForAllTypeSerializer<>(new XmlMapper());
        animalSerializer3.serialize(dog);
    }
}