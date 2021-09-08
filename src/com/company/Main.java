package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(f(input.nextInt()));
    }

    static int f(int n)
    {
        if (n < 3)
        {
            if (n == 0)
            {
                return 0;
            }
            else {
                return 1;
            }

        }
        else {
            return f(n-1) + f(n - 2);
        }
    }
}
