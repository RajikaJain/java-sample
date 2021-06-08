package JavaPart2.ClassesAndObjects;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private final int minBaseSalary=0;
    private final int minHourlyRate=10;

    public int calculateWage1(int extraHours)
    {
        return baseSalary +(hourlyRate*extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary<=minBaseSalary)
        throw new IllegalArgumentException("Salary should not be 0 or negative number");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    public void sethourlyRate(int hourlyRate)
    {
    if(hourlyRate<minHourlyRate)
    throw new IllegalArgumentException("Hourly rate should be greater than"+minHourlyRate);
    this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }

    
    
}
