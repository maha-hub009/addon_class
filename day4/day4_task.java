import java.util.Scanner; 
class Student{ 
    String name; 
    int rollno; 
    int mark1,mark2,mark3; 
    void getDetails() 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a student name"); 
        name=sc.nextLine(); 
        System.out.println("Enter a student rollno"); 
        rollno=sc.nextInt(); 
        System.out.println("Enter a mark 1"); 
        mark1=sc.nextInt(); 
        System.out.println("Enter a mark 2"); 
        mark2=sc.nextInt(); 
        System.out.println("Enter a mark 3"); 
        mark3=sc.nextInt(); 
    } 
    void display(){ 
        int tot=mark1+mark2+mark3; 
        float avg=tot/3f; 
        System.out.println("\n\t****Student mark***"); 
        System.out.println("Name:"+ name); 
        System.out.println("Rollno:"+rollno); 
        System.out.println("Mark1:"+ mark1); 
        System.out.println("mark2:"+ mark2); 
        System.out.println("Mark3:"+ mark3); 
        System.out.println("Total"+tot); 
        System.out.println("Average"+avg); 

        if(avg>=50) 
        { 
            System.out.println("Result:pass"); 
        } 
        else{ 
            System.out.println("Result:fail"); 
        } 
    } 
}  



public class StudentManagement{ 
    public static void main(String[] args) 
    { 
        Student s = new Student(); 
        s.getDetails(); 
        s.display(); 
    } 
} 

output: 
enter name:anu 
enter roll no:05 
enter mark1:75 
enter mark2:80 
enter mark3:70 

name:anu 
rollno:05 
mark1:75 
mark2:80 
mark3: 70 
total :225 
avaerage:75.0 
result:pass 
-------------------------------------------------------------------------------- 
2)Salary calculation: 

import java.util.Scanner; 
class Person { 
    String name; 
    int age; 
    void getDetails(Scanner sc) 
    { 
        System.out.print("Enter name: "); 
        name = sc.nextLine(); 
        System.out.print("Enter age: "); 
        age = sc.nextInt(); 
    } 

    void showDetails()  
    { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    } 
} 


class Employee extends Person { 
    double basicSalary; 
    double hra; 
    double da; 

    void setSalary(Scanner sc) { 
        System.out.print("Enter basic salary: "); 
        basicSalary = sc.nextDouble(); 

        hra = 0.2 * basicSalary; 
        da = 0.1 * basicSalary; 
    } 

    double calculateSalary() { 
        return basicSalary + hra + da; 
    } 

    void displaySalary() { 
        System.out.println("Total Salary: ₹" + calculateSalary()); 
    } 
} 

public class SalaryDemo { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        Employee emp = new Employee(); 
        emp.getDetails(sc); 
        emp.setSalary(sc); 
        System.out.println("\nEmployee Details:"); 
        emp.showDetails(); 
        emp.displaySalary(); 

        sc.close(); 
    } 
} 
output: 
enter name:anu 
enter age:19 
enter basic salary:20000 

employee details 
name:anu 
age:19 
total salary:26000.0 
------------------------------------------------------------------------------------------- 