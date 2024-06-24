package org.iu.dspwa1022.springdata.repository;

import java.util.Optional;

import org.iu.dspwa1022.springdata.model.Department;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @EntityGraph(attributePaths = { "employees" })
    Optional<Department> findById(Long id);
}
