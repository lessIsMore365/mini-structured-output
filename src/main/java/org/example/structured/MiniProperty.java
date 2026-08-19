package org.example.structured;

public class MiniProperty {

    private final String name;

    private final MiniType type;

    public MiniProperty(
            String name,
            MiniType type
    ) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MiniType getType() {
        return type;
    }
}