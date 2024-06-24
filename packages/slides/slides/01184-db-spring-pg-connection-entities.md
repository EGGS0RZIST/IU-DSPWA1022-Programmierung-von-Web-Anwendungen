---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="DB-Verbindung in Spring"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Genau wie bisher müssen wir auch jetzt die `@Entity`-Klassen definieren und damit der Anwendung das Datenbank-Schema (Tabellen, Spalten, Relationen, ...) bekannt zu machen (siehe z.B. [Customer.java](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/model/Customer.java))

</div>
<div class="col-span-12">

```java
@Entity
@Table(schema = "dspwa1022", name = "customer")
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator", parameters = {
            @Parameter(name = "uuid_gen_strategy_class", value = "org.hibernate.id.uuid.CustomVersionOneStrategy")
    })
    private UUID id;

    private String name;

    private String email;

    @OneToMany
    private List<Order> orders = new ArrayList<>();

}
```

</div>
</div>
