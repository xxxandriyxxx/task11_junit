package com.epam.forTests;

public class ForTests {

    public static void exceptionMethod(int value) throws Exception {
        if(value == 10){
            throw new Exception("Exception from exceptionMethod!!!!");
        }
    }
}
