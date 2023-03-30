import java.util.Scanner;

public class App {
    //Scanner for type in the console
    static Scanner myAdd = new Scanner(System.in);

    //Variables for the programm
    static int startOption;
    static String addItem;

    public static void main(String[] args) throws Exception {
        System.out.println("What do you want to do? \n1: Add item\n2: Remove item");
        startOption = myAdd.nextInt();

        if(startOption == 1){
            System.out.println("You are in the option 1");
        } else if (startOption == 2){
            System.out.println("You are in the option 2");
        } else {
            System.out.println("This option has not found...");
        }
    }
}
