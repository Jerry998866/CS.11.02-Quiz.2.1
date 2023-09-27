import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // scanning user's input for each method:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter 3rd number: ");
        int num3 = scanner.nextInt();
        System.out.println("Please enter 4th number: ");
        int num4 = scanner.nextInt();
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();
        userName = scanner.nextLine();
        System.out.println("Please enter any thing you want to print: ");
        String contentPrint = scanner.nextLine();

        //Storing results into variables:
        int resultOne = add(num1, num2);
        String resultTwo = greeting(userName);
        int resultThree = add(num1, num2, num3, num4);

        //Printing results:
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        printMe(contentPrint);
    }

    //Four methods:
    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour,"+name+"!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int addOne = add(numOne, numTwo);
        int addTwo = add(numThree, numFour);
        return add(addOne, addTwo);
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}