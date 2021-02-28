public class IfElseStatement {

    /**
     *  In the below example our flow of execution will enter throught the main() function and traverse our code from
     *  "top to bottom". We use the IF and ELSE operators to manipulate the flow of execution, if the expression that follows an if
     *  statement resolves to "true" the nested code will be executed. Else another nested block of code will be executed.
     *
     *  EXPECTED OUTPUT:
     *  ================
     *  Program Start
     *  x was NOT equal to y
     *  Program End
     */

    public static void main(String[] args) {
        System.out.println("Program Start");

       int x = 1;
       int y = 2;

       if (x == y) {
           System.out.println("x was equal to y");
       } else {
           System.out.println("x was NOT equal to y");
       }

        System.out.println("Program End");
    }
}