package com.dsa.practices.dec2024.dec19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHigestSalary {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(34,24,242,43,134);
        System.out.println("Salary : " + getSecondHigestSalary(data));
    }

    public static int getSecondHigestSalary(List<Integer> data){
        Optional<Integer> first = data
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        return first.get();
    }
}
