---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="Grundlagen"/>

<div class="grid grid-cols-12 gap-4">
<div class="col-span-6">

```sql
create table product (
    id uuid primary key default gen_random_uuid(),
    name text not null,
    price float not null
);

create table customer (
    id uuid primary key default gen_random_uuid(),
    name text not null,
    email text not null
);

create table order (
    id uuid primary key default gen_random_uuid(),
    customer uuid not null references customer,
    created_at timestamp not null default now()
);

create table order_item (
    id uuid primary key default gen_random_uuid(),
    "order" uuid not null references order,
    product uuid not null references product,
    quantity float not null
);
```

</div>
<div class="col-span-6">

- Das Datenbank-Schema muss in _SQL_ übersetzt werden, damit wir die Datenbank damit füllen können
- Wir definieren die Tabellen (`create table`) und deren Spalten (jeweils mit Name, Typ, Defaults, ...)
- Mittels `references` legen wir die Relationen an (genauer: einen [Foreign Key Constraint](https://www.postgresql.org/docs/current/ddl-constraints.html#DDL-CONSTRAINTS-FK))
- _Constraints_ liegen nicht nur bei Fremdschlüssel-Beziehungen vor, sondern etwa auch bei [`not null`](https://www.postgresql.org/docs/current/ddl-constraints.html#DDL-CONSTRAINTS-NOT-NULL)

<Figcaption>Wir nutzen den PostgreSQL-Dialekt von SQL, der formell vom Standard und z.B. MySQL minimal abweicht.</Figcaption>

</div>
</div>

<PageNumber/>
