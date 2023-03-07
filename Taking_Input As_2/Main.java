import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        
        Scanner s = new Scanner(System.in); // to creat an input class

    //Code for adding two integers entered by the user
        // System.out.println("Enter first number:");
        // int num1 = s.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = s.nextInt();

        // int sum = num1+num2;
        // System.out.println("The Sum is:" + sum);


    // example code for calculatin simple interest
        // System.out.println("enter the amount-");
        // float A = s.nextFloat();

        // System.out.println("Enter the Rate-");
        // float R = s.nextFloat();

        // System.out.println("Enter the Time-");
        // float T = s.nextFloat();

        // System.out.println("Amount :"+A);
        // System.out.println("Rate :"+R);
        // System.out.println("Time :"+T);

        // float interest = (A*R*T)/100;

        // System.out.println("the interest is = " + interest);


    // program to read character using the Scanner class.
        // System.out.println("Enter character:");
        // char c = s.next().charAt(0); // to take only a character from a string
        // System.out.println(c);


    //MCQ-1 Practical
        // int p = s.nextInt(); // it will take integer value of input
        // String q = s.next(); // it will take string input
        // System.out.print(p); // it will print the result of p
        // System.out.println(q); // it will print the result of q
        // //the input for above code is "20 physics wallah" so what will be the output for the above code.
        // so the answer is same as notes answer that is "20physics".

        
    //MCQ-2 Practical
        String p = s.next(); //it take string i.e. (hello)
        int q = s.nextInt(); // it take integer i.e (any number like- 1,2,46..)
        System.out.print(p + " " + q); // this is the output .
        //the input for above code is "Hello World 21" so what will be the output for the above code.
        // so the answer is same as notes answer that is "Mismatch error" because of "s.nextint()" it will try
        // to conver the input (World) into integer.
    }
}