package org.example.structured;

import java.lang.reflect.Field;

public interface MiniPropertyNameResolver {
    String resolve(
            Field field
    );
}
