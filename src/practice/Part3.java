/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 *
 * @author Ryan Schissel
 */
public class Part3{
    
    public static void main(String[] args) {
        Map<String, Employee> employeeMap = new TreeMap<>();
        Employee e1 = new Employee(1, "Case", "Justin", "123-12-1237");
        Employee e2 = new Employee(1, "Thatlaust", "Guy", "123-12-1235");
        Employee e3 = new Employee(1, "Sassin", "Anna", "123-12-1234");
        Employee e4 = new Employee(1, "Fyle", "Peter", "123-12-1232");
        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e2.getSsn(), e2);
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);
        
        Collection values = employeeMap.values();
        
        //doesn't work
        //Collections.sort(values);
    }
}