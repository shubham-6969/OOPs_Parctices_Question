/* Topic Constructors: A member function used to initialize an object while creating it */
class Employee {
    String name;
    int id;
    int income;
    int age;
    int Experience;

    // Constructor to initialize name, id, and income
    Employee(String n, int i, int in) {  
        name = n;
        id = i;
        income = in;
    }

    // Constructor to initialize age and experience
    Employee(int a, int ex) {      
        age = a;
        Experience = ex;
    }
}

public class My_Constructor {
    public static void main(String[] args) {
        // Create an Employee object using the first constructor
        Employee Ajay = new Employee("Ajay Singh", 45, 45000);

        // Create an Employee object using the second constructor
        Employee Ajay1 = new Employee(27, 3);

        // Print details of the first Employee object
        System.out.println("Employee name is: " + Ajay.name + 
                           "\nEmployee id is: " + Ajay.id + 
                           "\nEmployee income is: " + Ajay.income);

        // Print details of the second Employee object
        System.out.println("Age of Employee: " + Ajay1.age + 
                           "\nExperience of employee: " + Ajay1.Experience + " years");
    }
}
