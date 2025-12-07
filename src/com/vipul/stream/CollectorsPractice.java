package com.vipul.stream;

import com.vipul.data.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class CollectorsPractice {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vipul", "Anshul", "Pooja", "Mayank");

        List<Employee> empList = Arrays.asList(
            new Employee("Anshul", 28),
            new Employee("Pooja", 26),
            new Employee("Vipul", 28),
            new Employee("Mayank", 29)
        );

        Map<String, Integer> map =
                    list.stream()
                        .collect(Collectors.toMap(
                                     (str) -> str,
                                     (str) -> str.length()
                                )
                        );
        System.out.println(map);

        Boolean collectListandPerformOperation =
                list.stream()
                    .collect(Collectors.collectingAndThen(
                                                Collectors.toList(),
                                                element -> element.contains("Vipul")
                            )
                    );

        System.out.println(collectListandPerformOperation);


        Map<Integer, String> m = list.stream()
                       .collect(Collectors.groupingBy(
                                            element -> element.length(),
                                            Collectors.joining(",")
                               )
                       );
        System.out.println(m);

        System.out.println(
            empList.stream()
                   .sorted( (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()) )
                   .collect( Collectors.toList() )
        );

        System.out.println(
                empList.stream()
                        .sorted(Comparator.comparing(Employee::getName))
                        .collect( Collectors.toList() )
        );

        Map<String, List<Employee>> empMap = empList.stream()
               .collect( Collectors.groupingBy( (employee) -> employee.getName() ) );

        

        






    }
}

