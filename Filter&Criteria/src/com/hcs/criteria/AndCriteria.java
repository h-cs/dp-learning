package com.hcs.criteria;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:05
 */
public class AndCriteria implements Criteria {

    private Criteria criteriaX;
    private Criteria criteriaY;

    public AndCriteria(Criteria x, Criteria y) {
        this.criteriaX = x;
        this.criteriaY = y;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> criteriaXPersonList = criteriaX.meetCriteria(personList);
        return criteriaY.meetCriteria(criteriaXPersonList);
    }
}
