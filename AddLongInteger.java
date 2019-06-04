package com.tech.day;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AddLongInteger {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        while(sin.hasNext()){
            String addend = sin.next();
            String augend = sin.next();
            BigInteger num1 = new BigInteger(addend);
            BigInteger num2 = new BigInteger(augend);
            System.out.println(num1.add(num2));
        }
    }
}
