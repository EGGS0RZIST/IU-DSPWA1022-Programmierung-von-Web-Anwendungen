package org.iu.dspwa1022.springdata.repository;

import org.iu.dspwa1022.springdata.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
