package com.company;

import java.util.Objects;

import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        boolean RUNNING = true;
        while (RUNNING) {
            String OPERATION = input("give operation: ");
            if (OPERATION.equals("end"))
                RUNNING = false;
            else {
                int A = inputInt("give first integer operand: ");
                int B = inputInt("give second integer operand: ");
                if (OPERATION.equals("add"))
                    output(A + B);
                else if (OPERATION.equals("sub"))
                    output(A - B);
                else
                    output("unknown operation");
            }
        }


    }
}
