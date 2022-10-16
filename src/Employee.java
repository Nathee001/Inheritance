 class Employee {
    int salary=50000;
}
class Manager extends Employee{
    int bonus=25000;

    public static void main(String[] args) {
        Manager m= new Manager();
        System.out.println("Manager Salary "+m.salary);
        System.out.println("Manager bonus "+m.bonus);
        int Gross_salary=m.salary+m.bonus;
        System.out.println("Manager full salary"+ Gross_salary);
    }
 }