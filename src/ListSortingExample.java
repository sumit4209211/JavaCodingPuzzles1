import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Sorting an Employee class based on salary and age
public class ListSortingExample{
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(10000.00, 10));
        employeeList.add(new Employee(20000.00, 10));
        employeeList.add(new Employee(14000.00, 10));
        employeeList.add(new Employee(17000.00, 10));
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge);
        employeeList.sort(groupByComparator);
        System.out.println(employeeList);

        }


    }
