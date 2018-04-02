/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jowin
 */
public class Staff extends Employee
{
    private int salary;
    
    public Staff( )
    {
        super();
        salary = 1;
    }
    
    public Staff(String initialName, int initialEmployeeNumber,
            String initialDeptName, int initialSalary)
    {
        super(initialName, initialEmployeeNumber, initialDeptName);
        setSalary(initialSalary);
    }
    
    public void reset(String newName, int newEmployeeNumber,
            String newDeptName, int newSalary)
    {
        reset(newName, newEmployeeNumber, newDeptName);
        setSalary(newSalary);
    }
    
    public int getsalary()
    {
        return salary;
    }
    
    public void setSalary(int newSalary)
    {
        if ((newSalary > 0)&& (newSalary <= 20))
            salary = newSalary;
        else
        {
            System.out.println("Staff member has no no salary!");
            System.exit(0);
        }
    }
    
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Staff Member Salary: " + salary);
    }
    
    public boolean equals(Staff otherStaff)
    {
        return equals((Employee)otherStaff) &&
               (this.salary == otherStaff.salary);
    }
}
