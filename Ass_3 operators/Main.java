public class Main{
    public static void main(String[] args) {
        
    // // example code for Arthmatic operators

        // int a=15, b=10; // a & b are declared

        // // Addition operation
        // System.out.println(a + b); //25

        // // Substraction operation
        // System.out.println(a - b);//5

        // // Multiplication operation
        // System.out.println(a * b);//150

        // //Division operation
        // System.out.println(a / b);//1

        // //Modulo operator
        // System.out.println(a % b);//5


    // Example for Relational operators
        
        // int a=10, b=15;

        // // == Operator
        // System.out.println(a == b); //false

        // // != Operator
        // System.out.println(a != b); //True

        // // > Operator
        // System.out.println(a>b); //false

        // // >= Operator
        // System.out.println(a >= b); //false

        // // < Operator
        // System.out.println(a < b); //True

        // // <= Operator
        // System.out.println(a <= b); //True


    // Example code for Logical operators

        int x=5, y=10, z=15;
        
        // && operator (logical AND)
        // System.out.println(x == y && x < y && z > x); //false
        // System.out.println(x < z && x < y && z > x); //True

        // || operator (logical OR)
        // System.out.println(x > y || x < y ); // True
        // System.out.println(x < y || z > x); // true
        // System.out.println(y > z || x > y); // flase

        // ! Operator (logical NOT)
        // System.out.println(!(x < y)); //false
        // System.out.println(!(x > y)); // true


    // Example code for Assignment operators

        // int p=2, q=5;

        // // = (assign Operator)
        // System.out.println(p = q); // 5

        // // += Operator
        // System.out.println(p += q);// 10 

        // // -= operator
        // System.out.println(p -= q); //5

        // // *= operator
        // System.out.println(p *= q); //25

        // // /= operator
        // System.out.println(p /= q); //5


    //Example code for Unary Operators
        // int n = 7, m = 7;
        // // post increament
        // System.out.println(n++); // assign hokr increment ho jati h. means 7 print hone ke bad increment ho jayegi.
        
        // // pre-increment
        // System.out.println(++m); // increment hokr assign ho jati h . means 7 will be converted into 8.

        // // ! (logical complement operator used for bolean data type to complement)
        // boolean s = true;
        // System.out.println("s=" + s); //true
        // s = !s; // logical complement
        // System.out.println("s=" + s);// false


    // Example code for bitwise operators
        // initialize p
        //     int p = 5; // (1 0 1) binary value for 5 
        //     // System.out.println(p<<2); // answer will be 20 that is (1 0 1 0 0) 
        // // Shifting the value of p towards the left two positions

        // System.out.println(p>>2); // answer will be 1 that is (1)
        
    // Example code for bitwise operators (works on bits)
        int a=5, b=7; 

        System.out.println("a & b =" + (a & b)); //5 bitwise &(AND) operator
        System.out.println("a | b =" + (a | b)); //7 bitwise |(OR) operator
        System.out.println("a ^ b =" + (a ^ b)); //2 bitwise ^(NOT) operator
        







    }
}