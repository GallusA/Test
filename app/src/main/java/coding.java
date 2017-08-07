import com.example.gallusawa.test.MainActivity;

import java.util.Scanner;

/**
 * Created by gallusawa on 8/7/17.
 */


public class coding {

    public static void main(String args[]) {

    //Create a singleton class and make it thread safe

        public class ASingleton {

            private static MainActivity.ASingleton instance = null;

            private ASingleton() {
            }

            public static MainActivity.ASingleton getInstance() {
                if (instance == null) {
                    instance = new MainActivity.ASingleton();
                }
                return instance;
            }



        }
      //Simple Java Program to check or find if a number is Armstrong number or not.

        class ArmstrongNumber {
            public static void main(String args[])

            int num, tmp, remainder,
                int sum = 0;
                int dgts = 0;

                Scanner in = new Scanner(System.in);
                System.out.println("Input a number to check if it is an Armstrong number");
                num = in.nextInt();

                tmp = num;
                while (tmp != 0) {
                    dgts++;
                    tmp = tmp / 10;
                }

                tmp = num;

                while (tmp != 0) {
                    remainder = tmp % 10;
                    sum = sum + power(remainder, dgts);
                    tmp = tmp / 10;
                }

                if (num == sum)
                    System.out.println(num + " is an Armstrong number.");
                else
                    System.out.println(num + " is not an Armstrong number.");
            }

            static int power(int num1, int r) {
                int c, p = 1;

                for (c = 1; c <= r; c++)
                    p = p * num1;

                return p;
            }
        }
        //Method to push 4 string items in a stack and then pop all four with printing them






        String [] array = new array[3];

        public String pushNum (array [] String){
        int size;int result=0;
        for(int=0;array.length;i++){
        if(size==array.length){
        array[size++]=result;
        return result;
                  }
               }
           }

       public String popNum(array [] String){
        int size; int result=0;
        for(int=0;array.length;i++){
        int size=0; int result=0;
        if(size==0){
        result=array[size-1];
        array[--size]=null;
        return result;
             }
          }
        }


    }