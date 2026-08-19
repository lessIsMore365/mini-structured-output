package org.example.structured;

import java.util.List;

public class MiniClassMetadata {

    private final Class<?> type;

    private final List<MiniProperty> properties;

    public MiniClassMetadata(
            Class<?> type,
            List<MiniProperty> properties
    ) {
        this.type = type;
        this.properties = properties;
    }

    public Class<?> getType() {
        return type;
    }

    public List<MiniProperty> getProperties() {
        return properties;
    }
}
