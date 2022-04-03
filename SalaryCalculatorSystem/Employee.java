package SalaryCalculatorSystem;

public class Employee {

    public static void main(String[] args) {

        Employee worker=new Employee("Hassan",2000,45,1985);
        worker.print();

    }
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Work hour : "+this.workHours);
        System.out.println("Hire Year : "+this.hireYear);
        System.out.println("Tax : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Raise salary : "+this.raiseSalary());
        System.out.println("Salary with taxes and bonuses : "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Total salary : "+(this.salary+this.raiseSalary()));
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else
            return 0;
    }

    double raiseSalary(){
        if (2021-this.hireYear<10){
            return this.salary*0.05;
        }
        else if (2021-this.salary<20){
            return  this.salary*0.1;
        }
        else{
            return this.salary*0.15;
        }

    }
}

