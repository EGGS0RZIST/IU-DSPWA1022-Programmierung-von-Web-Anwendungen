---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Relationen <SubHeading text="n:m"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

Eine _n:m_-Relation bedeutet, dass mehrere Objekte A zu jeweils mehreren Objekten B zugeordnet werden können

> Studierende können an mehreren Kursen teilnehmen; ein Kurs hat mehrere Studierende

</div>
<div class="col-span-7">

```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Student_Course",
        joinColumns = { @JoinColumn(name = "student_id") },
        inverseJoinColumns = { @JoinColumn(name = "course_id") }
    )
    private Set<Course> courses = new HashSet<>();
}
```

</div>
<div class="col-span-5">

```java
@Entity
public class Course {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students
        = new HashSet<>();
}
```

</div>
</div>

<PageNumber/>

<!--
- `joinTable` definiert die _owning_ Seite der n:m-Beziehung
-->
