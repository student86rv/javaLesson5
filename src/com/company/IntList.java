package com.company;

public interface IntList {

    void add(int value);

    void add(int index, int value);

    void remove(int index);

    void clear();

    boolean contains(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    boolean isEmpty();

}
