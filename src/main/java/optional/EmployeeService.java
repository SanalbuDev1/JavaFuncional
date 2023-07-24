package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeService implements EmployeeRepository {

    public static List<Employee> getEmployeesFromDb(){

        return Arrays.asList(new Employee("correo1@ml.com","santiago","apellido1",18,"Medico"),
                new Employee("correo2@ml.com","jose","apellido2",19,"Ingeniero"),
                new Employee("correo3@ml.com","maria","apellido3",20,"Medico"),
                new Employee("correo4@ml.com","luis","apellido4",21,"Dev"));

    }

    public Optional<Employee> findEmployeeByEmail(String email){
        List<Employee> employees = getEmployeesFromDb();
        return employees.stream()
                .filter(e -> e.getEmail().equals(email))
                .findFirst();
    }

    public Optional<Employee> isDeveloperOptional(String email){
        List<Employee> employees = getEmployeesFromDb();
        return employees.stream()
        .filter(e -> e.getEmail().equals(email))
        .filter(e -> e.getRol().equals("Dev"))
        .findFirst();
    }

}
