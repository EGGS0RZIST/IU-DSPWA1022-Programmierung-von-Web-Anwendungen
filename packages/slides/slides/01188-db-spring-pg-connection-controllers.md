---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="DB-Verbindung in Spring"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Schließlich fehlen noch die Controller, welche die HTTP-Endpunkte zur Verfügung stellen

</div>
<div class="col-span-12">

```java
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @RequestMapping
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Customer findById(@PathVariable UUID id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
```

</div>
</div>

<PageNumber/>
