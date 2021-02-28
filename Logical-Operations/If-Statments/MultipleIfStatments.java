public class IfElseStatement {

    /**
     *  In the below example our flow of execution will enter through the main() function and traverse our code from
     *  "top to bottom". We use the IF and ELSE-IF and ELSE operators to manipulate the flow of execution, if the expression that follows an if
     *  statement resolves to "true" the nested code will be executed. Else IF the seconde IF condition resolves to true it's nested code will be executed,
     *  ELSE another nested block of code will be executed.
     *
     *  EXPECTED OUTPUT:
     *  ================
     *  Program Start
     *  x was equal to z
     *  Program End
     */

    public static void main(String[] args) {
        System.out.println("Program Start");

        int x = 1;
        int y = 2;
        int z = 1;

        if (x == y) {
            System.out.println("x was equal to y");
        } else if (x == z) {
            System.out.println("x was equal to z");
        } else {
            System.out.println("x was NOT equal to y OR z");
        }

        System.out.println("Program End");
    }
}