package com.Practice.Practice_New.experiment.experimentfolder;

import com.Practice.Practice_New.Model.Employee;

import java.util.*;

public class ComparatorImp{

    public static void main(String[] args) {

//      In below code COMPARATOR is used for sorting the objects of custom clas based on eID
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Basu","Dev"));
        employees.add(new Employee(3L,"Ashu","Dev"));
        employees.add(new Employee(2L,"Mohit","Dev"));
        employees.add(new Employee(5L,"Suresh","Dev"));
        employees.add(new Employee(4L,"Mukul","Dev"));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getEId() - o2.getEId());
            }
        });

        for (Employee e:employees) {
            System.out.println(e.getEId()+" "+ e.getFirstName()+" "+ e.getLastName());
        }

//        In below code COMPARATOR is used for sorting the elements of the list

//        List<Integer> l1 = Arrays.asList(1, 4, 5, 2, 90, 4, 5, 21);
//        Collections.sort(l1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        System.out.println(l1);

    }

}
