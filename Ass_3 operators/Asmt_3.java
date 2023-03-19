import java.util.Scanner;
public class Asmt_3{
    public static void main(String[] args) {

        // // Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
        // // is taken with 5 and then multiply the resultant value by 5. Display the final result

        // int a = 10;
        // System.out.println((((a+8)/3)%5)*5); // 5




        // Q2 - Swap two numbers without the use of third variable.
        Scanner sc = new Scanner(System.in); //input class is created.
        // System.out.println("Enter first number:");
        // int a = sc.nextInt();

        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // System.out.println("before swapping a is:" + a);
        // System.out.println("before swapping b is:" + b);

        // //logic for swapping
        // a = a + b; // 10 + 20 = 30
        // b = a - b; // 30 - 20 = 10
        // a = a - b; // 30 - 10 = 20

        // System.out.println("after swapping a is: " + a);
        // System.out.println("after swapping b is: " + b);



        // Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
        // System.out.println("Enter a 3-digit number: ");
        // int a = sc.nextInt();
        // int sum = 0;

        // while(a != 0){
        //     sum = sum + (a % 10); // getting most right digit of number using this operater & adding it to sum var.
        //     a = a / 10; // removing most right digit of number by dividing 10. 
        // }
        // System.out.println("SUM OF DIGITS :- " + sum); // printing the sum variable.






        // Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        // i) both the conditions 'a < 50' and 'a < b' are true.
        // ii) at least one of the conditions 'a < 50' or 'a < b' is true.

        // int a = 55,  b = 70;  // variables can be assigned like this also.
        // System.out.println(a < 50 && a < b);  // flse
        // System.out.println(a < 50  ||  a < b); //True





// Q5 - Find the total number of bits needed to be flipped to convert x to y.
// Input: 65 80
// Output: 2
// counting set bits
// The idea is to take XOR of the given two integers. After calculating the XOR, the problem will reduce to
// counting set bits in the XOR output using Brian Kernighan algorithm.

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = a ^ b;
            int count = 0;
            while (n != 0){
                n = n & (n - 1);
                count++;
            }
            System.out.println(count);

        
 
        
        
    }
}