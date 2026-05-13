package org.example.corejavasamples.Javanewfeatures;


import java.util.*;
import java.util.stream.Collectors;

class EmployeeLcl{
    String name;
    String dept;

    EmployeeLcl(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeLcl{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

public class CollectDemo {
    public static void main(String[] args) {
        List<EmployeeLcl> empls = Arrays.asList(
                new EmployeeLcl("Naresh", "CSE"), new EmployeeLcl("Raj", "CSE"),
                new EmployeeLcl("Rakesh", "ECE"), new EmployeeLcl("Harish", "ECE")
        );
        //1. Collect the result to a collection.
        Set<EmployeeLcl> cseEmpls = empls.stream().filter(emp -> emp.dept.equals("CSE")).collect(Collectors.toSet());
        System.out.println("Collected to collection :: "+cseEmpls);

        //2. Grouping of data
        Map<String, List<EmployeeLcl>> groupedData = empls.stream().collect(Collectors.groupingBy(EmployeeLcl::getDept));
        System.out.println("Grouped Data:::"+ groupedData);

        //3. Aggregate Results. we can do sum, average, count etc.
        List<Integer> nums = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10, 11);
        int sum = nums.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Nums total is::: "+sum);

        Long count = nums.stream().collect(Collectors.counting());
        System.out.println("Nums count is::: "+count);

    }
}
