---
layout: default
---

<!-- <Footer
    text="☕️ Java-Web-Technologien"
/> -->

# Spring Data <SubHeading text="Entity"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- In _JPA_ verknüpfen wir eine Java-Klasse mittels _Annotationen_ mit einer Datenbanktabelle und die Properties mit den entsprechenden Spalten

![Struktur der `person`-Tabelle](/images/spring/data/person-table-structure.png){.border .max-h-32}

<Figcaption>Struktur der Person-Tabelle (oben) und Beispieldaten (unten)</Figcaption>

![Daten in der `person`-Tabelle](/images/spring/data/person-table-data.png){.border .max-h-32}

</div>
<div class="col-span-6 -mt-12">

```java
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

</div>
</div>

<!-- <PageNumber/> -->
