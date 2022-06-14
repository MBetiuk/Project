package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    @Query(value = "SELECT * FROM employees WHERE  super_visor_id LIKE %:superVisor% AND employee_type_enum like " +
            "%:employeeTypeEnum%",
            nativeQuery =
            true)

List<Employee> search(@Param("superVisor") String superVisor, @Param("employeeTypeEnum") String employeeTypeEnum);

//    @Query(value = "SELECT * FROM employees WHERE employee_type_enum LIKE %:employeeTypeEnum% AND ",nativeQuery = true)
//
//    List<Employee> searchEmplEnum(@Param("employeeTypeEnum") String employeeTypeEnum);


    @Query(value = "SELECT * FROM employees WHERE super_visor_id IS not null", nativeQuery = true)
    List<Employee> searchSV();

}
//