package com.Practice.Practice_New.experiment.experimentfolder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class HashMap_Equals_and_Hashcode_Employee {

    private String name;
    private int age;
    private String  departmentID;
    private Long salary;

    @Override
    public int hashCode() {
        return Objects.hash(name,age,departmentID,salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return  true;
        }
        if(obj==null){
            return false;
        }
        if(getClass() !=obj.getClass()){
            return false;
        }
        HashMap_Equals_and_Hashcode_Employee other = (HashMap_Equals_and_Hashcode_Employee) obj;

        return age == other.age
              && Objects.equals(name,other.name)
              && Objects.equals(departmentID,other.departmentID)
              && Objects.equals(salary,other.salary);
    }

    @Override
    public String toString() {
        return "HashMap_Equals_and_Hashcode_Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", departmentID='" + departmentID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
