package com.hcs.criteria;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:06
 */
public class OrCriteria implements Criteria {

    private Criteria criteriaX;
    private Criteria criteriaY;

    public OrCriteria(Criteria x, Criteria y) {
        this.criteriaX = x;
        this.criteriaY = y;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> criteriaXPersonList = criteriaX.meetCriteria(personList);
        List<Person> criteriaYPersonList = criteriaY.meetCriteria(personList);

        for (Person person : criteriaYPersonList) {
            if (!criteriaXPersonList.contains(person)) {
                criteriaXPersonList.add(person);
            }
        }

        return criteriaXPersonList;
    }
}
