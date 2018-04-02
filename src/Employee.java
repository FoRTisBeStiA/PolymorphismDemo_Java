/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jowin
 */
public class Employee extends Person 
{
    
    private int employeeNumber;
    private String deptName;
    
    public Employee( )
    {
        super();
        employeeNumber = 0; //Indicating no number yet
        deptName = ""; //Idicating no name yet
    }
    
    public Employee (String initialName, int initialEmployeeNumber, 
            String initialDeptName)
    {
        super(initialName);
        employeeNumber = initialEmployeeNumber;
        deptName = initialDeptName;
    }
    
    public void reset(String newName, int newEmployeeNumber, 
            String newDeptName)
    {
        setName(newName);
        employeeNumber = newEmployeeNumber;
        deptName = newDeptName;
    }
    
    public int getEmployeeNumber ()
    {
        return employeeNumber;
    }
    
    public String getDeptName()
    {
        return deptName;
    }
    
    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Department: " + deptName);
    }

    public boolean equals(Employee otherEmployee)
    {
        return this.hasSameName(otherEmployee) &&
              (this.employeeNumber == otherEmployee.employeeNumber) &&
                (this.deptName == otherEmployee.deptName);
    }
    
    public String toString( )
    {
        return "Name: " + getName( ) +
			   "\nEmployee number: "  + employeeNumber +
                            "\nEmployee Department: " + deptName;
    }
}
