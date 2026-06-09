package ru.alfabank;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        //Часть 1. Название-Логотип.
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Ovcharenko");
        lastName.add("Nikulin");
        lastName.add("Ovchurin");
        lastName.add("Nikolenko");
        String randLastName = getRandLastName(lastName);
        String amp = "&";

        Faker faker = new Faker();
        String resultFaker = faker.name().lastName();
//        System.out.println(resultFaker);

        try {
            System.out.println(FigletFont.convertOneLine(randLastName));
            System.out.println(FigletFont.convertOneLine(amp));
            System.out.println(FigletFont.convertOneLine(resultFaker));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Часть 2. Генерилка юр данных для регистрации
        String fullName = faker.name().fullName();
        String phone = faker.phoneNumber().cellPhone();
        String address = faker.address().streetAddress();
        System.out.println(fullName);
        System.out.println(phone);
        System.out.println(address);

    }

    public static String getRandLastName(ArrayList<String> lastName) {
        final Random random = new Random();
        String randLastName = lastName.get(random.nextInt(lastName.size()));
//        System.out.println(randLastName);
        return randLastName;
    }


}