package org.iu.dspwa1022.springdata.util;

import org.iu.dspwa1022.springdata.model.Department;
import org.iu.dspwa1022.springdata.model.Employee;
import org.iu.dspwa1022.springdata.repository.DepartmentRepository;
import org.iu.dspwa1022.springdata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentInitializer {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    @Bean
    CommandLineRunner loadData() {
        return args -> {
            employeeRepo.deleteAll();
            departmentRepo.deleteAll();

            final var d1 = new Department(1L, "IT");
            final var d2 = new Department(2L, "HR");
            final var d3 = new Department(3L, "Sales");

            final var e1 = new Employee(1L, "John");
            final var e2 = new Employee(2L, "Jane");
            final var e3 = new Employee(3L, "Mary");
            final var e4 = new Employee(4L, "Peter");

            e1.setDepartment(d1);
            e2.setDepartment(d2);
            e3.setDepartment(d3);
            e4.setDepartment(d1);

            departmentRepo.save(d1);
            departmentRepo.save(d2);
            departmentRepo.save(d3);

            employeeRepo.save(e1);
            employeeRepo.save(e2);
            employeeRepo.save(e3);
            employeeRepo.save(e4);
        };
    }
}
