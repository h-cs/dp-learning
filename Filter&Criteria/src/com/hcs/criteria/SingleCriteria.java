package com.hcs.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:05
 */
public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<>();
        for (Person person : personList) {
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
