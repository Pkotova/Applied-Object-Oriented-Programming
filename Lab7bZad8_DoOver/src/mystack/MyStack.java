package mystack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Object> list;

    public MyStack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
