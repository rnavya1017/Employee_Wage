public class EmpWageBuilder {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private CompanyEmpWage[] companyArray;
    private int numOfCompanies;

    public EmpWageBuilder(int size) {
        companyArray = new CompanyEmpWage[size];
        numOfCompanies = 0;
    }

    public void addCompanyEmpWage(String company,
                                  int empRatePerHour,
                                  int numOfWorkingDays,
                                  int maxHoursPerMonth) {

        companyArray[numOfCompanies] =
                new CompanyEmpWage(company,
                                   empRatePerHour,
                                   numOfWorkingDays,
                                   maxHoursPerMonth);

        numOfCompanies++;
    }

    public void computeEmpWage(CompanyEmpWage company) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= company.maxHoursPerMonth &&
               totalWorkingDays < company.numOfWorkingDays) {

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

        int totalEmpWage =
                totalEmpHours * company.empRatePerHour;

        company.setTotalEmpWage(totalEmpWage);
    }

    public void computeAllWages() {

        for (int i = 0; i < numOfCompanies; i++) {

            computeEmpWage(companyArray[i]);

            System.out.println(companyArray[i]);
        }
    }
}