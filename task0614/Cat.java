package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }
//Статический метод printCats() должен только выводить на печать переменную cats!!!
    public static void printCats() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(cats.get(i));
        }
    }

    
}
