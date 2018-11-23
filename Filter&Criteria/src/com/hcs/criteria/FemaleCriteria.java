package com.hcs.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:05
 */
public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersonList = new ArrayList<>();
        for (Person person : personList) {
            if ("FEMALE".equalsIgnoreCase(person.getGender())) {
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
