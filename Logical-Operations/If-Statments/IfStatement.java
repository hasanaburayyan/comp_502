public class IfStatement {

    /**
     *  In the below example our flow of execution will enter through the main() function and traverse our code from
     *  "top to bottom". We use the IF operator to manipulate the flow of execution, if the expression that follows an if
     *  statement resolves to "true" the nested code will be executed. If the expression is false, the nested code is NOT
     *  executed and instead is skipped over.
     *
     *  EXPECTED OUTPUT:
     *  ================
     *  Program Start
     *  This line was executed
     *  Program End
     */

    public static void main(String[] args) {
        System.out.println("Program Start");

        // The below expression will resolve to true, therfore its nested code will be executed
        if (1 == 1) {
            System.out.println("This line was executed");
        }

        // The below expression will resolve to false, therefore its nested code will NOT be executed
        if (1 == 2) {
            System.out.println("This line was NOT executed");
        }

        System.out.println("Program End");
    }
}