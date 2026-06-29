public class EmployeeMain {

    public static void main(String[] args) {

        EmpWageBuilder tcs =
                new EmpWageBuilder("TCS", 20, 20, 100);

        EmpWageBuilder infosys =
                new EmpWageBuilder("Infosys", 25, 22, 120);

        EmpWageBuilder wipro =
                new EmpWageBuilder("Wipro", 30, 25, 150);

        tcs.computeEmpWage();
        infosys.computeEmpWage();
        wipro.computeEmpWage();

        tcs.printEmpWage();
        infosys.printEmpWage();
        wipro.printEmpWage();
    }
}