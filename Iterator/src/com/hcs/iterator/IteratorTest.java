package com.hcs.iterator;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 23:03
 */
public class IteratorTest {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
