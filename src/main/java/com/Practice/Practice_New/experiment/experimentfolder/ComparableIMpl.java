package com.Practice.Practice_New.experiment.experimentfolder;

import com.Practice.Practice_New.Model.Employee;
import com.Practice.Practice_New.exception.RecordNotFoundExep;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableIMpl {
    static  ArrayList<HR_Staff> employees= new ArrayList<>();
    public static void main(String[] args) {

        employees.add(new HR_Staff(1L,"Basu","Dev"));
        employees.add(new HR_Staff(3L,"Ashu","Dev"));
        employees.add(new HR_Staff(2L,"Mohit","Dev"));
        employees.add(new HR_Staff(5L,"Suresh","Dev"));
        employees.add(new HR_Staff(4L,"Mukul","Dev"));

        Collections.sort(employees);

        for (HR_Staff hr: employees) {
            System.out.println(hr.getEId()+" "+hr.getFirstName()+" "+ hr.getLastName());
        }
        ComparableIMpl ob1 = new ComparableIMpl();
        HR_Staff hr = ob1.findHr(6L);
        try {
            System.out.println(hr.getEId()+" "+hr.getFirstName()+" "+ hr.getLastName());
        }catch (Exception re){
            re.getMessage();
        }



    }
//    below method is for checking the exception class is working fine or not
    public HR_Staff findHr(long eid){
        for (HR_Staff e1:employees) {
            if(e1.getEId().equals(eid)){
                return e1;
            }
            else{
                try {
                    throw new RecordNotFoundExep("record not found");
                }catch (RecordNotFoundExep re){

                }

            }
        }
        return null;
    }
}
