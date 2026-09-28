package org.example.structured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;

public class JacksonPropertyNameResolver
        implements MiniPropertyNameResolver {

    @Override
    public String resolve(Field field) {

        JsonProperty annotation =
                field.getAnnotation(
                        JsonProperty.class
                );

        if (annotation != null
                && !annotation.value().isEmpty()) {

            return annotation.value();
        }

        return field.getName();
    }
}
