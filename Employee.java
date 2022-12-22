/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irem
 */
public class Employee
{
    private String name;
    private String department;
    private int salary;
    private int ID;
    
    
    public Employee(String name,String department,int salary,int ID)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;     
        this.ID=ID;
    }
    
   public void showInfo()
   {
       System.out.println("Name:"+getName());
       System.out.println("Department:"+getDepartment());
       System.out.println("Salary:"+getSalary());
       System.out.println("ID:"+getID());
       
   }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
