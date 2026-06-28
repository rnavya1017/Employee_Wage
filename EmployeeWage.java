import java.util.Random;

public class EmployeeWage {
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;

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
public static void employeeWage() {

    final int FULL_TIME = 1;
    final int PART_TIME = 2;

    int empCheck = (int)(Math.random() * 3);

    int empHours = 0;

    switch (empCheck) {

        case FULL_TIME:
            empHours = 8;
            break;

        case PART_TIME:
            empHours = 4;
            break;

        default:
            empHours = 0;
    }

    int wage = empHours * 20;

    System.out.println("Employee Wage = " + wage);
}
   public static void calculateMonthlyWage() {

        int totalWage = 0;
        int totalDays = 20;

        for (int day = 1; day <= totalDays; day++) {

            int empCheck = (int)(Math.random() * 3);

            int empHours = 0;

            switch (empCheck) {

                case FULL_TIME:
                    empHours = 8;
                    break;

                case PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            int dailyWage = empHours * EMP_RATE_PER_HOUR;
            totalWage += dailyWage;

            System.out.println("Day " + day +
                    " Hours: " + empHours +
                    " Wage: " + dailyWage);
        }

        System.out.println("Monthly Wage = " + totalWage);
    }
    // UC6 : Calculate Wage Till 100 Hours or 20 Days
    public static void calculateWageTillCondition() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < 100 && totalDays < 20) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3);

            int empHours = 0;

            switch (empCheck) {

                case FULL_TIME:
                    empHours = 8;
                    break;

                case PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            if (totalHours + empHours > 100) {
                empHours = 100 - totalHours;
            }

            totalHours += empHours;

            int dailyWage = empHours * EMP_RATE_PER_HOUR;

            System.out.println("Day " + totalDays +
                    " Hours: " + empHours +
                    " Wage: " + dailyWage);
        }

        int totalWage = totalHours * EMP_RATE_PER_HOUR;

        System.out.println("Total Days = " + totalDays);
        System.out.println("Total Hours = " + totalHours);
        System.out.println("Total Wage = " + totalWage);
    }
}

