package ru.alfabank;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Ovcharenko");
        lastName.add("Nikulin");
        lastName.add("Ovchurin");
        lastName.add("Nikolenko");
        String randLastName = getRandLastName(lastName);
        String amp = "&";

        Faker faker = new Faker();
        String resultFaker = faker.name().lastName();
        System.out.println(resultFaker);

        try {
            System.out.println(FigletFont.convertOneLine(randLastName + amp + resultFaker));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getRandLastName(ArrayList<String> lastName) {
        final Random random = new Random();
        String randLastName = lastName.get(random.nextInt(lastName.size()));
        System.out.println(randLastName);
        return randLastName;
    }
}