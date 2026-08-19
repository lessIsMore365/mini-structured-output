package org.example.structured;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MiniTypeResolver {

    public MiniType resolve(Type type) {

        if (type instanceof Class<?> clazz) {

            return new MiniType(
                    clazz,
                    List.of()
            );
        }

        if (type instanceof ParameterizedType parameterizedType) {

            Class<?> rawClass =
                    (Class<?>) parameterizedType.getRawType();

            List<MiniType> arguments =
                    new ArrayList<>();

            for (Type argument :
                    parameterizedType.getActualTypeArguments()) {

                arguments.add(
                        resolve(argument)
                );
            }

            return new MiniType(
                    rawClass,
                    arguments
            );
        }

        throw new IllegalArgumentException(
                "Unsupported type: " + type
        );
    }
}
