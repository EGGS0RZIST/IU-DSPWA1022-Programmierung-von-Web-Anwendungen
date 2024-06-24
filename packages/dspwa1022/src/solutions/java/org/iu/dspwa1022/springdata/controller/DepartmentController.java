package org.iu.dspwa1022.springdata.controller;

import java.util.List;

import org.iu.dspwa1022.springdata.model.Department;
import org.iu.dspwa1022.springdata.model.Employee;
import org.iu.dspwa1022.springdata.repository.DepartmentRepository;
import org.iu.dspwa1022.springdata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department dep) {
        return departmentRepository.save(dep);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return departmentRepository.findById(id)
                .map(department -> ResponseEntity.ok().body(department))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/employees")
    public ResponseEntity<List<Employee>> getDepartmentEmployees(@PathVariable Long id) {
        return departmentRepository.findById(id)
                .map(department -> ResponseEntity.ok().body(department.getEmployees()))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{departmentId}/employees/{employeeId}")
    public ResponseEntity<Department> addEmployeeToDepartment(@PathVariable Long departmentId,
            @PathVariable Long employeeId) throws ResponseStatusException {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Department not found"));
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));

        employee.setDepartment(department);
        employeeRepository.save(employee);

        return ResponseEntity.ok().build();
    }

}
