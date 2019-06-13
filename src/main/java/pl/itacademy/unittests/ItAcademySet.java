package pl.itacademy.unittests;


import java.util.Objects;

public class ItAcademySet {

    private Object[] items;

    private int insertPosition = 0;

    public ItAcademySet() {
        this.items = new Object[10];
    }

    public boolean isEmpty() {
        return insertPosition == 0;
    }

    public void add(Object object) {
        if(Objects.isNull(object)) {
            throw new NullPointerException("Adding null objects not allowed!");
        }
        items[insertPosition] = object;
        insertPosition++;
    }

    public boolean contains(Object o) {
        if(isEmpty()) {
            return false;
        }

        for (int i = 0; i < insertPosition; i++) {
            Object item = items[i];
            if (item.equals(o)) {
                return true;
            }
        }
        return false;
    }
}
