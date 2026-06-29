public class EmpWageBuilder {

    // Instance Variables
    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    // Constants
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    // Constructor
    public EmpWageBuilder(String company,
                          int empRatePerHour,
                          int numOfWorkingDays,
                          int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    // Method to compute wage
    public void computeEmpWage() {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;

            int empHours = 0;

            int empCheck = (int)(Math.random() * 3);

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        totalEmpWage = totalEmpHours * empRatePerHour;
    }

    // Method to display result
    public void printEmpWage() {
        System.out.println("Company Name : " + company);
        System.out.println("Employee Rate Per Hour : " + empRatePerHour);
        System.out.println("Working Days : " + numOfWorkingDays);
        System.out.println("Maximum Hours : " + maxHoursPerMonth);
        System.out.println("Total Wage : " + totalEmpWage);
        System.out.println("-----------------------------");
    }
}