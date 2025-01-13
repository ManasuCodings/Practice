package com.Practice.Practice_New.experiment.experimentfolder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HR_Staff implements Comparable<HR_Staff> {

    public Long eId;
    public String firstName;
    public String lastName;



    @Override
    public int compareTo(HR_Staff o) {
        return (int) (this.eId - o.getEId());
    }
}
