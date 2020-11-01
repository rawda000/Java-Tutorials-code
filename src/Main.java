/**
 * Main Program Structure
 */

/** public class Main :
 * public -> this says anyone can run the program
 * class -> all code in a java program must belong to a class
 * Main -> The name of the class
 */
public class Main {

    /** public static void main(String[] args) :
     * public -> anyone can run this method
     * static -> this method belongs to the class, not the object
     * void -> this method does not return anything
     * @param args the parameters passed to this method (in this case
     * the arguments on the command line as an array of strings
     * { } curly braces for the opening and closing of the method body
     */
    public static void main(String[] args) {
        /**
         * System.out.println("Hello world!"); :
         * System.out.println() -> The name of the method we want to call (in this case the method for printing strings
         * on the screen)
         * "Hello world!" -> the parameter passed to this method (in this case the string
         * we want to print)
         * ; -> semicolon indicating the end of this statement
         */
        System.out.println("Hello world!");
    }
}
