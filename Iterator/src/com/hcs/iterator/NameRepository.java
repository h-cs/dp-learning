package com.hcs.iterator;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 22:59
 */
public class NameRepository implements Container {

    public final static String NAME[] = {
            "Robert",
            "John",
            "Julie",
            "Lora"
    };


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < NAME.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return NAME[index++];
            }
            return null;
        }
    }
}
