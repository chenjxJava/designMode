package com.chenjx.designMode.struct;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.util.Lists;

import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Shape> shapes = Lists.newArrayList(
                Rectangle.of(10, 20),
                Square.of(50)
        );

        // serializing
        String jsonString = objectMapper.writeValueAsString(Containers.of(shapes));
        System.out.println("jsonString=" + jsonString);
        System.out.println();


        // deserializing
        Containers containers = objectMapper.readValue(jsonString, Containers.class);
        System.out.println("containers=" + containers);

    }
}



