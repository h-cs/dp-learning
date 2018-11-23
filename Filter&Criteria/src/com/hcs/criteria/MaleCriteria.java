package com.hcs.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:05
 */
public class MaleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<>();
        for (Person person : personList) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                malePersonList.add(person);
            }
        }

        return malePersonList;
    }
}
