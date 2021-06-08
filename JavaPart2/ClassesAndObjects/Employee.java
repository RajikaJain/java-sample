package JavaPart2.ClassesAndObjects;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private final int minBaseSalary=0;
    private final int minHourlyRate=10;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        sethourlyRate(hourlyRate);
    }

    public int calculateWage1(int extraHours)
    {
        return baseSalary +(hourlyRate*extraHours);
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
