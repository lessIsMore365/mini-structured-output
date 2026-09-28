package org.example.structured;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MiniFactoriesLoader {

    private static final String FACTORIES_RESOURCE =
            "META-INF/mini.factories";


    public static List<String> loadNames(
            Class<?> factoryType
    ) {

        List<String> names =
                new ArrayList<>();

        ClassLoader classLoader =
                Thread.currentThread()
                        .getContextClassLoader();


        try {

            var resources =
                    classLoader.getResources(
                            FACTORIES_RESOURCE
                    );


            while (resources.hasMoreElements()) {

                var url =
                        resources.nextElement();


                try (InputStream inputStream =
                             url.openStream()) {

                    Properties properties =
                            new Properties();

                    properties.load(
                            inputStream
                    );


                    String key =
                            factoryType.getName();


                    String value =
                            properties.getProperty(
                                    key
                            );


                    if (value == null) {
                        continue;
                    }


                    String[] classNames =
                            value.split(",");


                    for (String className :
                            classNames) {

                        names.add(
                                className.trim()
                        );
                    }
                }
            }

        } catch (IOException e) {

            throw new IllegalStateException(
                    "Failed to load " +
                            FACTORIES_RESOURCE,
                    e
            );
        }


        return names;
    }
}
