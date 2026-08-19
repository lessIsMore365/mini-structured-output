package org.example.structured;

import java.util.List;

public class MiniType {

    private final Class<?> rawClass;

    private final List<MiniType> arguments;

    public MiniType(
            Class<?> rawClass,
            List<MiniType> arguments
    ) {
        this.rawClass = rawClass;
        this.arguments = arguments;
    }

    public Class<?> getRawClass() {
        return rawClass;
    }

    public List<MiniType> getArguments() {
        return arguments;
    }

    public void print(String indent) {

        System.out.println(
                indent + rawClass.getName()
        );

        for (MiniType argument :
                arguments) {

            argument.print(
                    indent + "    "
            );
        }
    }
}