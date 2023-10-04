package comp31.formdemo.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import comp31.formdemo.model.Employee;

@Component
public class Accounts extends ArrayList<Employee> {

    public Employee findByUserId(String userId, String password) {
        for (Employee employee : this) {
            if (employee.getUserId().equals(userId) && employee.getPassword().equals(password))
                return employee;
        }
        return null;
    }

    // TODO add findByDepartment
    // TODO add findAllEmployees

}
