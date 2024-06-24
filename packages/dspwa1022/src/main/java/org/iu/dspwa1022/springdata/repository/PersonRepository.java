package org.iu.dspwa1022.springdata.repository;

import org.iu.dspwa1022.springdata.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
