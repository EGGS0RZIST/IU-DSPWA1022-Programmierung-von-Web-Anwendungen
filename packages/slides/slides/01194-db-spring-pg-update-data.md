---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Spring / Postgres <SubHeading text="Update von Daten"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Durch die Erstellung eines `PATCH`-Endpunkts können wir bestehende Daten aktualisieren

</div>
<div class="col-span-6">

```java
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PatchMapping("/{id}")
    public Customer update(
        @PathVariable UUID id,
        @RequestBody Customer customer
    ) {
        final Customer existingCustomer = repo.findById(id);

        if (customer.getName() != null) {
            existingCustomer.setName(customer.getName());
        }
        if (customer.getEmail() != null) {
            existingCustomer.setEmail(customer.getEmail());
        }

        return repo.save(existingCustomer);
    }
}
```

</div>
<div class="col-span-6">

![update eines Kunden in Postman](/images/coursedb-postman-update-customer.png){.max-h-65}

</div>
</div>

<PageNumber/>
