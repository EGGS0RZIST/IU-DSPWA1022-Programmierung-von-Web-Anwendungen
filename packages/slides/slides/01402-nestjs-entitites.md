---
layout: default
---

# NestJS <SubHeading text="Datenbankanbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Ähnlich wie in Spring/JPA definieren wir `Entity`-Klassen, die der Struktur der Datenbank entsprechen

</div>
<div class="col-span-12">

<Filename>customer.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity({
  schema: "dspwa1022",
})
export class Customer {
  @PrimaryGeneratedColumn("uuid")
  id: string;

  @Column()
  name: string;

  @Column()
  email: string;

  @Column({
    name: "created_at",
  })
  createdAt: Date;
}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
