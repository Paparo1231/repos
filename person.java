package com.company;
import java.util.Random;
import java.util.Scanner;


public class person {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введи количество людей ");
        System.out.println("Количество равно " + str.nextLine());


    }

    public class personCharacteristic {
        public void main(String[] args) {
            person person = person.this;
            double weight = 100 + Math.random() * 100;
            double height = 100 + Math.random() * 100;
            String[] texts = {"green", "brown", "blue"};
            Random random = new Random();
            int eyecolor = random.nextInt(texts.length);
            System.out.println(person);
            System.out.println("eye color is " + texts[eyecolor]);
            System.out.println("weight is " + (weight));
            System.out.println("height is " + (height));
            String[] info;
            info = new String[2];
            info[0] = "eye color is" + eyecolor;
            info[1] = "weight is" + weight;
            info[2] = "height is" + height;
            System.out.println(info);



        }



} }












