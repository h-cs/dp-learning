package com.hcs.criteria;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:04
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> personList);
}
