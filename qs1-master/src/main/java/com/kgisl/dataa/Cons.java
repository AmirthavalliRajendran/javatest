package com.kgisl.dataa;

/**
 * Cons
 */
public class Cons {
    int empid;
    String name;
    float salary;

    // Cons(int empid,String name,float salary) {
    //     this.empid=empid;
    //     this.name=name;
    //     this.salary=salary;
    // }
    Cons(int empid) {
            this.empid=empid;
    }
    Cons(String name){
        this.name=name;
    }
    Cons(float salary){
        this.salary=salary;
    }
    
   public void display(){
       System.out.println("EmpId:"+empid);
       System.out.println("Name:"+name);
       System.out.println("Salary:"+salary);
       
   }

    public static void main(String[] args) {
        Cons c1= new Cons(12);
        Cons  c2= new Cons("Glad");
        Cons c3= new Cons(10000);
        c1.display();
        c2.display();
        c3.display();

    }

}