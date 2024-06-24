---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Relationen <SubHeading text="1:n"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

Eine _1:n_-Relation bedeutet, dass zu jedem Objekt A kein oder mehrere Objekte B zugeordnet sind

> Jede Abteilung hat beliebig viele Mitarbeitende

</div>
<div class="col-span-6">

```java
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees = new ArrayList<>();
}
```

</div>
<div class="col-span-6">

```java
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
```

</div>
</div>

<PageNumber/>
