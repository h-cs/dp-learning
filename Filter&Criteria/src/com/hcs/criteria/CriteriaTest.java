package com.hcs.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 10:13
 */
public class CriteriaTest {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John","Male", "Married"));
        personList.add(new Person("Laura","Female", "Married"));
        personList.add(new Person("Diana","Female", "Single"));
        personList.add(new Person("Mike","Male", "Single"));
        personList.add(new Person("Bobby","Male", "Single"));


        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);


        System.out.println("Males: ");
        printPersonList(male.meetCriteria(personList));

        System.out.println("Females: ");
        printPersonList(female.meetCriteria(personList));

        System.out.println("Single Males: ");
        printPersonList(singleMale.meetCriteria(personList));

        System.out.println("Single Or Females: ");
        printPersonList(singleOrFemale.meetCriteria(personList));
    }

    public static void printPersonList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person: [ Name: " + person.getName() +
                    ", Gender: " + person.getGender() +
                    ", Marital Status: " + person.getMaritalStatus() +
                    " ]");
        }
    }
}
