package com.company;

public class Main {

    public static void main(String[] args) {

        IntList list = new IntLinkedList();

        list.add(9);
        list.add(13);
        list.add(16);
        list.add(20);

        System.out.println("Исходный список: " + list);
        System.out.println("Размер списка: " + list.size());

        list.set(0, 21);
        System.out.println("Элемент 0 уст. значение 21: " + list);

        list.add(3,99);
        System.out.println("Добавлен элемент 99 в поз.3:" + list);

        list.remove(1);
        System.out.println("Удален элемент в поз.1: " + list);

        System.out.println("Содержит элемент со значением 11? " + list.contains(16));
        System.out.println("Элемент с индексом 2: " + list.get(2));

        list.clear();
        System.out.println("Теперь список пуст? " + list.isEmpty());
    }
}
