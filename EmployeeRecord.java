import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRecord {



    static Employee emp1 = new Employee(1,"Dubem","IT",120.0);
    static Employee emp2 = new Employee(1,"Nonso","IT",120.0);
    static Employee emp3 = new Employee(1,"Isaac","IT",120.0);
    static Employee emp4 = new Employee(1,"Buike","IT",120.0);

    static List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4);

    public static void listOfEmployeeNames(){
        List<String> employeeNames = employeeList.stream().map(Employee::getName).toList();
        List<String> employeeNames2 = employeeList.stream().collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println("First implementation "+employeeNames);
        System.out.println("Second implementation"+employeeNames2);

    }
    public static void main(String[] args) {
      listOfEmployeeNames();
    }
}
