import java.util.Scanner;
public class Asmt_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Q1 - Input name, roll number and field of interest from user and print in the format below :
// Name: xyz, Roll number: xyz, Field of interest: xyz

        // String first_name = sc.next();
        // String last_name = sc.next();
        // int roll_num = sc.nextInt();
        // String interest = sc.next();

        // System.out.print("Name:" + first_name);
        // System.out.println(last_name);
        // System.out.println("Roll number:" + roll_num);
        // System.out.println("Field of Interest:" + interest);



// Q2 - Input two different string and print them in same line.

        // String f = sc.next();
        // String s = sc.next();
        // System.out.println(f+s);
        // System.out.println(f + s);
        // System.out.println(f+"\n"+s);
        // System.out.println(f+"\t"+s);



// Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
//  to calculate his total marks and percentage marks

        // int firstSub = sc.nextInt();
        // int secondSub = sc.nextInt();
        // int thirdSub = sc.nextInt();

        // int sum = firstSub + secondSub + thirdSub;
        // float percents = (sum/3);

        // System.out.println("Total marks are : " + sum);
        // System.out.println("Percentages : " + percents + "%");
        


// Q4 - Given two numbers, return their sum in the following format:
// Int t representing number of test cases
// T lines of Two integers representing the numbers to be added
// Input :
// 3
// 4 5
// 18 20
// 49 27
// Output :
// 9
// 38
// 76

        // System.out.println("Enter");
        // int x = sc.nextInt();
        // for(int i = 1; i<=x; i++){
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     System.out.println(a+b);
        // }



// Q5 - Given few lines of input(number of lines unknown) where each line has two
// strings, concatenate the strings

            while(sc.hasNextLine()){
                String a = sc.next();
                String b = sc.next();
                System.out.println(a+b);
            }
        
    }
}