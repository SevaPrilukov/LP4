package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Фрукты в коробке appleBox1");
        Box<Apple> appleBox1 = new Box<>(new Apple());
        appleBox1.add(2);
        appleBox1.printBox();
        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("\n");

        System.out.println("Фрукты в коробке appleBox2");
        Box<Apple> appleBox2 = new Box<>(new Apple());
        appleBox2.add(1);
        appleBox2.printBox();
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        System.out.println("\n");

        System.out.println("Фрукты в коробке orangeBox");
        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.add(3);
        orangeBox.printBox();
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("\n");


        appleBox1.moveTo(appleBox2);
        appleBox1.printBox();
        System.out.println("\n");
        appleBox2.printBox();
        System.out.println("\n");

        System.out.println("Сравнение коробок с яблоками 1 и 2: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение коробок с яблоками 1 и апельсинами: " + appleBox1.compare(orangeBox));

        LemonBox<Lemon> lemonBox1= new LemonBox<>(new Lemon());
        lemonBox1.add(2);
        LemonBox<Lemon> lemonBox2= new LemonBox<>(new Lemon());
        lemonBox2.add(2);
        System.out.println("Сравнение коробок с яблоками 1 и 2: " + lemonBox1.compare(lemonBox2));
        //orangeBox.compare(lemonBox1);
        //appleBox1.moveTo(orangeBox);
        lemonBox2.printBox();

    }
}