package org.example.accessspecifiers.university;

import org.example.accessspecifiers.college.College;

public class UnivData extends College{

    public String univName = "JNTU";
    public void displayUnivName(){
        System.out.println(univName);
    }

    public static void main(String[] args) {
        College college = new College();
        System.out.println(college.collegeAffliation);
        college.showCollegeName();

        UnivData univData = new UnivData(); // Protected Demo outside package with inheritence
        univData.displayStaffCount(); // Protected Demo outside package with inheritence
        System.out.println("Staff Count Data "+univData.staffCount); // Protected Demo outside package with inheritence

    }
}
