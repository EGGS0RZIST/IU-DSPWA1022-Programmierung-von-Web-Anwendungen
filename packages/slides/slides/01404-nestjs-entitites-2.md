---
layout: default
---

# NestJS <SubHeading text="Datenbankanbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Die `Entity`-Klassen müssen wir in der globalen Konfiguration im `AppModule` hinterlegen

</div>
<div class="col-span-12">

<Filename>app.module.ts</Filename>

<!-- prettier-ignore-start -->

```ts
@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: 'postgres',
      host: 'localhost',
      port: 5432,
      username: 'root',
      password: 'root',
      database: 'test',
      entities: [
        Customer
      ],
    }),
  ],
})
export class AppModule {}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
