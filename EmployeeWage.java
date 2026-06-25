import java.util.Random;

public class EmployeeWage {

    public static void checkAttendance() {

        Random random = new Random();

        int attendance = random.nextInt(2);

        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
    public static void dailyWage() {

    int wagePerHour = 20;
    int fullDayHours = 8;

    int salary = wagePerHour * fullDayHours;

    System.out.println("Daily Wage = " + salary);
}
public static void partTimeWage() {

    int wagePerHour = 20;
    int partTimeHours = 4;

    int salary = wagePerHour * partTimeHours;

    System.out.println("Part Time Wage = " + salary);
}

}