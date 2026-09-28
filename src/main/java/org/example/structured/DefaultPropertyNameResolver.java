package org.example.structured;

import java.lang.reflect.Field;

public class DefaultPropertyNameResolver
        implements MiniPropertyNameResolver {

    @Override
    public String resolve(Field field) {

        return field.getName();
    }
}
