public class EmployeeWageUC8 {

    public static void computeEmpWage(String company,
                                      int empRatePerHour,
                                      int numOfWorkingDays,
                                      int maxHrsPerMonth) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsPerMonth &&
                totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;

            int empHrs = 0;

            int empCheck = (int)(Math.random() * 3);

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
        }

        int totalEmpWage = totalEmpHrs * empRatePerHour;

        System.out.println("Company : " + company);
        System.out.println("Total Hours : " + totalEmpHrs);
        System.out.println("Total Wage : " + totalEmpWage);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        computeEmpWage("TCS", 20, 20, 100);

        computeEmpWage("Infosys", 25, 22, 120);

        computeEmpWage("Wipro", 30, 25, 150);
    }
}