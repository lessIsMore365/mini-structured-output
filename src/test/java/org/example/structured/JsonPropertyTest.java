package org.example.structured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;

public class JsonPropertyTest {

    static void main() throws NoSuchFieldException {


        Field field =
                User.class.getDeclaredField("name");

//        JsonProperty annotation =
//                field.getAnnotation(
//                        JsonProperty.class
//                );
//

        String propertyName;

        JsonProperty annotation =
                field.getAnnotation(
                        JsonProperty.class
                );

        if (annotation != null
                && !annotation.value().isEmpty()) {

            propertyName =
                    annotation.value();

        } else {

            propertyName =
                    field.getName();
        }


                System.out.println(
                annotation.value()
        );

    }
}
