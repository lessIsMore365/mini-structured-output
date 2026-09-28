package org.example.structured;

public class MiniProperty {

    private final String javaName;

    private final String propertyName;

    private final MiniType type;

    public MiniProperty(
            String javaName,
            String propertyName,
            MiniType type
    ) {
        this.javaName = javaName;
        this.propertyName = propertyName;
        this.type = type;
    }

    public String getJavaName() {
        return javaName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public MiniType getType() {
        return type;
    }
}