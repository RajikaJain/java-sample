package JavaPart2.ClassesAndObjects;

public class EmployeeMain {
  public static void main(String[] args){
    var employee2 = new Employee(50_000);
    var employee = new Employee(50_000,20);
    int results =employee.calculateWage1(10);
    System.out.println(results); 
    int result2 = employee2.calculateWage1();
    System.out.println(result2);
    Employee.printNumberOfEmployees();
    //employee.baseSalary=50_000;
    //employee.hourlyRate=10;
    //  employee.setBaseSalary(50_000);
    //int baseSalary=employee.getBaseSalary();
    // System.out.println(baseSalary);

    //employee.sethourlyRate(20);
   // int hourlyRate=employee.getHourlyRate();
   // System.out.println(hourlyRate);

   
  } 
}
