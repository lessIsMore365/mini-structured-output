package org.example.structured;

import java.util.List;

public class MiniFactoriesDemo {

    public static void main(String[] args) {

        List<String> names =
                MiniFactoriesLoader.loadNames(
                        MiniPropertyNameResolver.class
                );

        for (String name : names) {

            System.out.println(name);
        }
    }
}
