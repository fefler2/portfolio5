package hello;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable> {

}
