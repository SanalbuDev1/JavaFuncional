package optional;

import java.util.Optional;

public class EmployeeController {

    // Instancia un objeto EmployeeService y lo asigna a la variable employeeService de tipo EmployeeRepository
    private static EmployeeRepository employeeService = new EmployeeService();
    private static final int NOT_EXIST = -1;

     /**
     * Busca un empleado por correo electrónico.
     * @param email el correo electrónico del empleado a buscar
     * @return un Optional que contiene el empleado si se encuentra, o vacío si no se encuentra
     */
    public static Optional<Employee> findEmployeeByEmail(String email){
        return employeeService.findEmployeeByEmail(email);
        //return isPresent == true ? employeeService.findEmployeeByEmail(email): Optional.empty();
    }

    /**
 * Busca un empleado por su rol y devuelve un Optional que contiene el empleado si se encuentra, o vacío si no se encuentra.
 * @param rol el rol del empleado a buscar
 * @return un Optional que contiene el empleado si se encuentra, o vacío si no se encuentra
 */
    public static Optional<Employee> isDeveloperOptional(String rol){
        return employeeService.isDeveloperOptional(rol);
    }

    public static void main(String[] args) {
        Optional<Employee> employee = isDeveloperOptional("correo4@ml.com");

        Employee getEmp = employee.orElse(new Employee("","","",-1,""));
        if(NOT_EXIST == getEmp.getAge()){
            System.out.println("No se encontro el empleado");
        }else{
            System.out.println(getEmp.getName());
        }       

        /*
        if(employee.isPresent()){
            System.out.println(employee.get().getName());
        }else{
            System.out.println("No se encontro el empleado");
        }*/

        
        

    }

}
