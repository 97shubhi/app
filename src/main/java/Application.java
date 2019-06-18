import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);


    public void userChoice() {

        Student student = new Student();
        System.out.println("press 1 for insert");
        System.out.println("press 2 for display");
        System.out.println("press 3 for delete");
        System.out.println("press 4 for update");
        student.setchoice(scanner.nextInt());
        Operation operation = new Operation();
        Student students = new Student();
        Application application = new Application();
        int choice=student.getchoice();
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            switch (choice) {
                case 1:
                    operation.insertData();
                    application.userChoice();
                    break;
                case 2:
                    operation.displayData();
                    application.userChoice();
                    break;
                case 3:
                    operation.deleteData();
                    application.userChoice();
                    break;
                case 4:
                    operation.updateData();

                    application.userChoice();
                    break;
            }
        }
        else if (choice == 5) {
            System.out.println("exit");
        }
        else {
            System.out.println("invalid choice");

            application.userChoice();
        }

    }
    public static void main(String args[]) {
        Application application = new Application();
        application.userChoice();
    }
}
