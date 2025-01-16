package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Jonas Jonaitis", 40, "jonas.j@gmail.com");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        File outputInput = new File("src/main/java/org/example/rezultatas.json");
        objectMapper.writeValue(outputInput, person);

        Person personFromJson = objectMapper.readValue(outputInput, Person.class);
        System.out.println(personFromJson);


        System.out.println("Does person match personFromJson? / answer: " +person.equals(personFromJson));



    }


}