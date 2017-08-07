package com.example.gallusawa.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class ASingleton {

        private static ASingleton instance = null;

        private ASingleton() {
        }

        public static ASingleton getInstance() {
            if (instance == null) {
                instance = new ASingleton();
            }
            return instance;
        }

    }


    class ArmstrongNumber
    {
        public static void main(String args[])
        {
            int num, tmp, remainder,
            int sum =0; int dgts = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Input a number to check if it is an Armstrong number");
            num = in.nextInt();

            tmp = num;
            while (tmp != 0) {
                dgts++;
                tmp = tmp/10;
            }

            tmp = num;

            while (tmp != 0) {
                remainder = tmp%10;
                sum = sum + power(remainder, dgts);
                tmp = tmp/10;
            }

            if (num == sum)
                System.out.println(num + " is an Armstrong number.");
            else
                System.out.println(num + " is not an Armstrong number.");
        }

        static int power(int num1, int r) {
            int c, p = 1;

            for (c = 1; c <= r; c++)
                p = p*num1;

            return p;
        }
    }

}
