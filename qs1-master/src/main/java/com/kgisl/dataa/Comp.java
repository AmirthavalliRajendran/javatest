package com.kgisl.dataa;


import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Comp
 */
public class Comp {
public static void main(String[] args) {
    List<Emp> ob = Arrays.asList(new Emp(22,"Glad", "BSc",10000), new Emp(2,"Amir", "BCA",15000), new Emp(52,"Meena", "MSC",25000),
    new Emp(30,"Swetha","MCA",  24000));
    List<Float> ob1=ob.stream().map(x->x.getSalary()).collect(Collectors.toList());
    ob1.forEach(System.out::println);
}

}