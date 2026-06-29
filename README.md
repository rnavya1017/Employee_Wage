# Employee_Wage
# Employee Wage Computation System

## Project Description

The Employee Wage Computation System is a Java console application developed using Object-Oriented Programming principles. The application calculates employee wages based on attendance, working hours, monthly wage limits, and company-specific wage policies.

The system gradually evolves through 14 use cases, demonstrating concepts such as classes, methods, constructors, arrays, interfaces, encapsulation, and polymorphism.

---

## Features

* Employee attendance checking
* Daily wage calculation
* Part-time and full-time employee support
* Switch case implementation
* Monthly wage calculation
* Working days and working hours constraints
* Wage calculation for multiple companies
* Company-specific employee wage policies
* Array-based company management
* Interface-based implementation
* Encapsulation and abstraction
* Total wage retrieval by company name

---

## Technologies Used

* Java
* Object-Oriented Programming
* Interface
* Arrays
* Classes and Objects
* Constructors
* Encapsulation
* Polymorphism

---



# Use Cases

## UC1: Check Employee Attendance

Randomly determine employee attendance.

## UC2: Calculate Daily Employee Wage

Calculate wage for a full-time employee.

## UC3: Add Part-Time Employee and Wage

Calculate wages for both full-time and part-time employees.

## UC4: Solve Using Switch Case

Use switch statements to determine working hours.

## UC5: Calculate Wages for a Month

Calculate monthly wages.

## UC6: Calculate Wages Until Total Working Hours or Days

Stop calculation after reaching maximum hours or days.

## UC7: Compute Employee Wage Using Class Method

Move logic into methods.

## UC8: Compute Employee Wage for Multiple Companies

Support multiple companies.

## UC9: Store Company Emp Wage in Class

Create CompanyEmpWage class.

## UC10: Manage Employee Wage of Multiple Companies

Maintain company wage objects.

## UC11: Use Interface Approach

Create IEmpWageBuilder interface.

## UC12: Store Company Objects in Array

Manage multiple companies using arrays.

## UC13: Ability to Query Total Wage by Company

Retrieve wage information using company name.

## UC14: Complete Employee Wage Builder

Final implementation using interface and company management.

---

## Interface

```java
public interface IEmpWageBuilder {
    void addCompanyEmpWage(String company,
                           int empRatePerHour,
                           int numOfWorkingDays,
                           int maxHoursPerMonth);

    void computeEmpWage();
}
```

---

## CompanyEmpWage Class

```java
public class CompanyEmpWage {

    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage(String company,
                          int empRatePerHour,
                          int numOfWorkingDays,
                          int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String getCompany() {
        return company;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    @Override
    public String toString() {
        return company + " Total Wage = " + totalEmpWage;
    }
}
```

---

## How to Run

1. Open the project in Eclipse/IntelliJ/VS Code.
2. Compile the project.

```bash
javac *.java
```

3. Run the main class.

```bash
java EmployeeWageMain
```

---

## Sample Output

```
Company: TCS
Total Employee Wage: 32000

Company: Infosys
Total Employee Wage: 40000
```

---

## OOP Concepts Used

| Concept       | Usage                 |
| ------------- | --------------------- |
| Class         | CompanyEmpWage        |
| Object        | Company Objects       |
| Method        | Wage Calculation      |
| Constructor   | Object Initialization |
| Encapsulation | Private Variables     |
| Interface     | IEmpWageBuilder       |
| Polymorphism  | Interface Reference   |
| Abstraction   | Hiding Implementation |

---

## Author

Developed as part of the Employee Wage Computation Java project to demonstrate Core Java and Object-Oriented Programming concepts.
