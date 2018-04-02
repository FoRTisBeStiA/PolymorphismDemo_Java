/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jowin
 */
public class Faculty extends Employee
{
    private String memberTitle;
    
    public Faculty( )
    {
        super();
        memberTitle = "";
    }
    
    public Faculty(String initialName, int initialEmployeeNumber,
            String initialDeptName, String initialTitle)
    {
        super(initialName, initialEmployeeNumber, initialDeptName);
        //setTitle(initialTitle);
        setTitle(initialTitle);
    }
    
    public void reset(String newName, int newEmployeeNumber,
            String newDeptName, String newTitle)
    {
        reset(newName, newEmployeeNumber, newDeptName);
        setTitle(newTitle);
    }
    
    public String getTitle()
    {
        return memberTitle;
    }
    
    public void setTitle(String newTitle)
    {
        if (newTitle.length() > 0)
            memberTitle = newTitle;
        else
        {
            System.out.println("Faculty member has no title!");
            System.exit(0);
        }
    }
    
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Faculty Member Title: " + memberTitle);
    }
    
    public boolean equals(Faculty otherFaculty)
    {
        return equals((Employee)otherFaculty) &&
               (this.memberTitle == otherFaculty.memberTitle);
    }
}
