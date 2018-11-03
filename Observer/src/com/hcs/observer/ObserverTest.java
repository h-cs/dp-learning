package com.hcs.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:58
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject oddSubject = new OddSubject();
        Subject evenSubject = new EvenSubject();

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(oddSubject);
        subjectList.add(evenSubject);

        BinaryObserver binaryObserver = new BinaryObserver(subjectList);
        OctalObserver octalObserver = new OctalObserver(subjectList);
        HexObserver hexObserver = new HexObserver(subjectList);

        oddSubject.flush(2);
        evenSubject.flush(2);
    }
}
