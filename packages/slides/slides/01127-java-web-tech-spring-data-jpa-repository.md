---
layout: default
---

<!-- <Footer
    text="☕️ Java-Web-Technologien"
/> -->

# Spring Data <SubHeading text="Repository"/>

<div class="grid grid-cols-12">
<div class="col-span-12">

- Mit einem _Repository_ greifen wir in unserem Code auf die Daten in einer Tabelle zu
- Das Framework stellt dann automatisch einige Standardfunktionen wie `findAll()` und `save()` bereit

</div>
<div class="col-span-12 -mt-4">

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
```

```java
@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}
```

</div>
</div>

<!-- <PageNumber/> -->
