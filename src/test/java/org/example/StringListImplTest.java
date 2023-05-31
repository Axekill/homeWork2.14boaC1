package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;
import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
    StringListImpl stringList = new StringListImpl();




    @org.junit.jupiter.api.Test
    void add() {
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
        stringList.add("vim");
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        stringList.add(0,"jikhvhd");
    }

    @org.junit.jupiter.api.Test
    void set() {
        stringList.set(0, "oitot");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        stringList.remove("oitot");
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        stringList.remove(0);

    }

    @org.junit.jupiter.api.Test
    void contains() {
        stringList.contains("jkrhngj");
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        stringList.indexOf("kfnmgk");
    }

    @org.junit.jupiter.api.Test
    void lastIndexOf() {
        stringList.lastIndexOf("vfhgh");
    }

    @org.junit.jupiter.api.Test
    void get() {
        stringList.get(0);
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        stringList.equals(stringList);

    }

    @org.junit.jupiter.api.Test
    void size() {
        stringList.size();
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        stringList.isEmpty();
    }

    @org.junit.jupiter.api.Test
    void clear() {
        stringList.clear();
    }

    @org.junit.jupiter.api.Test
    void toArray() {
        stringList.toArray();

    }
}