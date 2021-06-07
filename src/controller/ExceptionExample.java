package controller;

import exception.QuynhException;

import java.util.ArrayList;

public class ExceptionExample {

    public static void testException() throws IndexOutOfBoundsException {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.get(1));
    }

    public static void testException2() throws IndexOutOfBoundsException {
        testException();
    }

    public static void main(String[] args) {
        try{
            testException2();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }
}

// compile time exception -> checked exception
// run time exception -> unchecked exception
// java -> bytecode -> run