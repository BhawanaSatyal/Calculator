public class Calculator1 {



    public void m1(double a, double b){    // declaring instance variables
        System.out.println("The Total Sum of "+a+" and "+b+" = "+(a+b)); // using instance contents
        System.out.println(+a+" + "+b+" = "+(a+b)); // using instance contents for addition
        System.out.println(+a+" - "+b+" = "+(a-b)); // using instance contents for Subtraction
        System.out.println(+a+" * "+b+" = "+(a*b)); // using instance contents for multiplication
        System.out.println(+a+" / "+b+" = "+(a/b)); // using instance contents for Division

    }

    public static void main(String[] args) {  // method
        Calculator1 calculator = new Calculator1(); // created object
        calculator.m1(35,70);// calling nonstatic method m1() inside the main method

    }
}