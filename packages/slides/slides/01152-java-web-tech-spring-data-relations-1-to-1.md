---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Relationen <SubHeading text="1:1"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

Eine _1:1_-Relation bedeutet, dass zu jedem Objekt A exakt ein Objekt B zugeordnet ist

> Jede Person hat genau einen Ausweis

</div>
<div class="col-span-6">

```java
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
        name = "passport_id",
        referencedColumnName = "id"
    )
    private Passport passport;
}
```

</div>
<div class="col-span-6">

```java
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "passport")
    private Person person;
}
```

</div>
</div>

<PageNumber/>
