---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="DB-Verbindung in Spring"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Die Definition der _Repositories_ ist in den meisten Fällen trivial, solange wir nur die Standard-Funktionen nutzen möchten (siehe [`repositories`](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/tree/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/repositories))

</div>
<div class="col-span-12">

```java
public interface CustomerRepository extends JpaRepository<Customer, UUID> { }

public interface ProductRepository extends JpaRepository<Product, UUID> { }

public interface OrderRepository extends JpaRepository<Order, UUID> { }

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> { }
```

</div>
</div>

<PageNumber/>
