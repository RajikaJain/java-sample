package JavaPart2.ClassesAndObjects;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private final int minBaseSalary=0;
    private final int minHourlyRate=0;
    public static int numberOfEmployees;

    
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        sethourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public Employee(int baseSalary){
       // setBaseSalary(baseSalary);
       // sethourlyRate(0);
       this(baseSalary, 0);
    }
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage1(int extraHours)
    {
        return baseSalary +(hourlyRate*extraHours);
    }
    public int calculateWage1()
    {
       // return baseSalary;
       return calculateWage1(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary<=minBaseSalary)
        throw new IllegalArgumentException("Salary should not be 0 or negative number");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private void sethourlyRate(int hourlyRate)
    {
    if(hourlyRate<minHourlyRate)
    throw new IllegalArgumentException("Hourly rate should be greater than"+minHourlyRate);
    this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }

    
    
}
