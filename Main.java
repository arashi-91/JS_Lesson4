package Lesson4.homework4;

import java.util.*;

public class Main {
    /* Задание 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
    */

    public static void main(String[] args) {

        List<String> tenWords = Arrays.asList(
                "Барсик", "Мурзик", "Пушок","Барсик","Вельзевул",
                "Гарфилд", "Барсик","Диего","Ерофей","Жора");

        Set<String> unique = new HashSet<String>(tenWords);

        System.out.println("Задание 1. \n");
        System.out.println("Первоначальный массив");
        System.out.println(tenWords.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique){
            System.out.println(key + ": " + Collections.frequency(tenWords, key) + "\n");

        }


        System.out.println("Задание 2. \n Создан справочник. \n Добавлены номера:" );

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+78881234567");
        phonebook.add("Иванов", "+78885678901");
        phonebook.add("Антонов", "+76669012345");
        phonebook.add("Андреев", "+75553216543");
        phonebook.add("Сидоров", "+73336787687");
        System.out.println("\n");
        System.out.println("Поиск номера по фамилии:");
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Антонов");
        System.out.println(phonebook.get("Антонов"));
        System.out.println("\n");

        System.out.println("Добавить номер телефона:");
        phonebook.add("Сидоров", "+73333457698");
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        phonebook.add("Антонов", "+76669012345");
        System.out.println("Антонов");
        System.out.println(phonebook.get("Антонов"));

    }

}
