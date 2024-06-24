---
layout: default
---

# NestJS <SubHeading text="Datenbankanbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Zur Datenbankanbindung in NestJS schauen wir uns [TypeORM](https://docs.nestjs.com/techniques/database) an
- Zunächst definieren wir die Datenbankverbdinung

</div>
<div class="col-span-12">

<Filename>app.module.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';

@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: 'postgres',
      host: 'localhost',
      port: 5432,
      username: 'root',
      password: 'root',
      database: 'test',
      entities: [/* ... */],
    }),
  ],
})
export class AppModule {}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
