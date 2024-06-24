---
layout: default
---

# NestJS <SubHeading text="Datenbankanbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Im jeweiligen Feature-Modul, in dem wir die Entities benötigen, importieren wir sie mittels `forFeature()`

</div>
<div class="col-span-12">

<Filename>store.module.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { CustomerService } from './customer.service';
import { CustomerController } from './customer.controller';
import { Customer } from './customer';

@Module({
  imports: [TypeOrmModule.forFeature([Customer])],
  providers: [CustomerService],
  controllers: [CustomerController],
})
export class StoreModule {}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
