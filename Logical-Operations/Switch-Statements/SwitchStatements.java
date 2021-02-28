public class IfElseStatement {

    /**
     *  In the below example our flow of execution will enter throught the main() function and traverse our code from
     *  "top to bottom". We use the Switch operators to examine defined Case conditions. The first case that is found to be true will execute its nexted code
     *  before exiting the switch statement. If no case evaulations are true, then the default block will execute.
     *
     *  EXPECTED OUTPUT:
     *  ================
     *  Program Start
     *  x was NOT equal to y OR z
     *  Program End
     */

    public static void main(String[] args) {
        System.out.println("Program Start");

        int x = 1;

        // Switch case evaluations must use CONSTANTS, so we will set y and z to be final
        final int y = 2;
        final int z = 3;

        switch (x) {
            case y:
                System.out.println("x was equal to y");
            case z:
                System.out.println("x was equal to z");
            default:
                System.out.println("x was NOT equal to y OR z");
        }

        System.out.println("Program End");
    }
}