package org.example.structured;

public class MiniStructuredOutputDemo {


    static void main() {

        MiniTypeResolver typeResolver =
                new MiniTypeResolver();

        MiniClassAnalyzer analyzer =
                new MiniClassAnalyzer(
                        typeResolver
                );

        MiniClassMetadata metadata =
                analyzer.analyze(
                        UserGroup.class
                );

        System.out.println(
                "Class: " +
                        metadata.getType().getName()
        );

        for (MiniProperty property :
                metadata.getProperties()) {

            System.out.println(
                    "Property: " +
                            property.getName()
            );

            System.out.println(
                    "Type:"
            );

            property.getType()
                    .print("    ");
        }




    }
}
