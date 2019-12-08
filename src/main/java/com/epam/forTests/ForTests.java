package com.epam.forTests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ForTests {

    public static void exceptionMethod(int value) throws Exception {
        if(value == 10){
            throw new Exception("Exception from exceptionMethod!!!!");
        }
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("src/main/resources/asd.txt");
        Scanner scan = new Scanner(fr);
        fr.close();
    }
}
