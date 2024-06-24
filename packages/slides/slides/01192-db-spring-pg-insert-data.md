---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Spring / Postgres <SubHeading text="Einsetzen von Daten"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Damit wir auch Daten via `POST` anlegen können, erweitern wir den Controller
- Die `id` wird durch die [`@GeneratedValue`-Annotation](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/model/Customer.java#L18) in der Java-Anwendung erzeugt, nicht von der Datenbank

</div>
<div class="col-span-6">

```java
@RestController
@RequestMapping("/customers")
public class CustomerController {

    // ...

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return repo.save(customer);
    }
}
```

</div>
<div class="col-span-6">

![Anlegen eines Kunden in Postman](/images/coursedb-postman-create-customer.png){.max-h-65}

</div>
</div>

<PageNumber/>
