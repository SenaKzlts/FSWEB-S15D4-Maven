package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this, (a, b) -> {
            if (a instanceof Comparable && b instanceof Comparable) {
                return ((Comparable) a).compareTo(b);
            }
            return 0;
        });
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            sort();
        }
        return removed;
    }
}
