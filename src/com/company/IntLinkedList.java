package com.company;

import java.util.Arrays;

public class IntLinkedList implements IntList {

    private class Element {
        private int value;
        private Element next;
        public Element(int value) {
            this.value = value;
        }
    }

    private int count = 0;
    private Element header;

    @Override
    public void add(int value) {
        Element element = new Element(value);
        if (count == 0) {
            header = element;
        } else {
            Element last = getElementAtIndex(count - 1);
            last.next = element;
        }
        count++;
    }

    @Override
    public void add(int index, int value) {
        Element element = new Element(value);
        if (index > count) {
            for (int i = count; i < index; i++) {
                add(0);
            }
        }
        Element prevElement = getElementAtIndex(index - 1);
        Element nextElement = getElementAtIndex(index);
        prevElement.next = element;
        element.next = nextElement;
        count++;
    }

    @Override
    public void remove(int index) {
        Element nextElement = getElementAtIndex(index + 1);
        if (index == 0) {
            header = nextElement;
        }
        else {
            Element prevElement = getElementAtIndex(index - 1);
            prevElement.next = nextElement;
        }
        count--;
    }

    @Override
    public void clear() {
        header = null;
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        Element tmp = header;
        for (int i = 0; i < count - 1; i++) {
            tmp = tmp.next;
            if (tmp.value == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        return getElementAtIndex(index).value;
    }

    @Override
    public void set(int index, int value) {
        getElementAtIndex(index).value = value;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    private Element getElementAtIndex(int index) {
        Element tmp = header;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public String toString() {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = get(i);
        }
        return Arrays.toString(arr);
    }
}
