import java.util.Scanner;
public class EmployeeWageMain {


    public static void main(String[] args) {

        EmployeeWage wage = new EmployeeWage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check Attendance\n2. Calculate Daily Wage \n3. Part Time Wage \n4.Employee Wage \n5. Calculate Monthly Wage \n6.Calculate Wage for 100 Hours \n7. Exit");
        System.out.print("Enter your choice: ");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                wage.checkAttendance();
                break;
            case 2:
                wage.dailyWage();
                break;
            case 3:
                wage.partTimeWage();
                break;
            case 4:
                wage.employeeWage();
                break;
            case 5:
                wage.calculateMonthlyWage();
                break;
            case 6:
                wage.calculateWageTillCondition();
                break;
            case 7:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
       
    }
}