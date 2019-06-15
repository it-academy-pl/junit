package pl.itacademy.unittests;

import java.util.Objects;

public class ItAcademyList {

    private String[] items = new String[10];

    private int insertPosition = 0;

    public boolean isEmpty() {
        return insertPosition == 0;
    }

    public void add(String item) {
        if(Objects.isNull(item)) {
            throw new NullPointerException("Item can not be NULL!");
        }
        items[insertPosition] = item;
        insertPosition++;
    }

    public void clear() {
        insertPosition = 0;
    }

    public boolean contains(String item) {
        for (int i = 0; i < insertPosition; i++) {
            if(items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
