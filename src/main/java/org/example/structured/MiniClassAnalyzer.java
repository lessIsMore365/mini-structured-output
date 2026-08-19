package org.example.structured;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MiniClassAnalyzer {

    private final MiniTypeResolver typeResolver;

    public MiniClassAnalyzer(
            MiniTypeResolver typeResolver
    ) {
        this.typeResolver = typeResolver;
    }

    public MiniClassMetadata analyze(
            Class<?> clazz
    ) {

        List<MiniProperty> properties =
                new ArrayList<>();

        Field[] fields =
                clazz.getDeclaredFields();

        for (Field field : fields) {

            String name =
                    field.getName();

            Type genericType =
                    field.getGenericType();

            MiniType type =
                    typeResolver.resolve(
                            genericType
                    );

            MiniProperty property =
                    new MiniProperty(
                            name,
                            type
                    );

            properties.add(property);
        }

        return new MiniClassMetadata(
                clazz,
                properties
        );
    }
}