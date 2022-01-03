package Lesson4.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    /* Задание 2
    Написать простой класс Телефонный Справочник, который хранит в себе список
     фамилий и телефонных номеров. В этот телефонный справочник с помощью метода
     add() можно добавлять записи, а с помощью метода get() искать номер телефона
      по фамилии. Следует учесть, что под одной фамилией может быть несколько
      телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
      выводиться все телефоны.
     */

    private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if (book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)){
                    numbers.add(number);
                    System.out.println("Фамилия " + surname + ", номер " + number );
            } else {
                System.out.println("Этот номер уже принадлежит " + surname);
            }
            } else {
                book.put(surname, new ArrayList<>(Arrays.asList(number)));
                System.out.println("Фамилия " + surname + ", номер " + number );
            }
        }

        public List<String> get(String surname){
            if (book.containsKey(surname)){
            return book.get(surname);
            } else {
                System.out.println(String.format("В справочнике нет номера для фамилии " + surname));
                return new ArrayList<>();
            }
        }
    }



