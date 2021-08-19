package com.company;

public class Main {

    public static void main(String[] args) {
       int num = 4;
       int num2 = 10;
        System.out.println(num + " + " +num2);

        int num3;
        num3=40;
        num=num +10;
        System.out.println(num);

        double doubleNum = 1.15;
        char symbol = '2';

        String word = "Hello World!";
        word = word + 20;
        System.out.println(word);

        // Условные выражения

        if (num > num2){
            System.out.println("num");
        }else{
            System.out.println("num2");
        }

        for (int i =1; i == 10; i++) {
            System.out.println("Число - " + i);
        }

        while (num < 20){
            System.out.println("---------" + num);
            num++;
        }


    }
}
