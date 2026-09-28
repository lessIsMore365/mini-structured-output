package org.example.structured;

import java.util.ServiceLoader;

public class ServiceLoaderTest {


    static void main() {


        ServiceLoader<MiniPropertyNameResolver> loader =
                ServiceLoader.load(
                        MiniPropertyNameResolver.class
                );

        for (MiniPropertyNameResolver resolver :
                loader) {

            System.out.println(
                    resolver.getClass()
            );
        }

    }
}
