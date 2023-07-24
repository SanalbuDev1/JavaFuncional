package optional;

import java.util.Optional;

public interface EmployeeRepository {

    public Optional<Employee> findEmployeeByEmail(String email);

    public Optional<Employee> isDeveloperOptional(String rol);

}
