package com.kgisl.dataa;

/**
 * Emp
 */
public class Emp {

    int id;
    String name;
    String department;
    float salary;

    Emp(int id,String name,String department,float salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
	public int getRno(){
        return id;
    }
    /**
     * @param rno the rno to set
     */
    public void setRno(int rno) {
        this.id = rno;
    }
    public String getName(){
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    /**
     * @param department the department to set
     */
    public void setDepartment(String Departemnt) {
        this.department= department;
    }
    public float getSalary(){
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary= salary;
    }
    public String toString() {
        return "ID " + id + "Name " + name +"Department " + department +"Salary"+salary;

    }



}
