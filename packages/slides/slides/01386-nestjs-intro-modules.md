---
layout: default
---

# NestJS <SubHeading text="Module"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- In Modulen wird der Code thematisch organisiert

</div>
<div class="col-span-6">

<Filename>app.module.ts</Filename>

```ts
import { Module } from "@nestjs/common";
import { CustomersModule } from "./modules/customers/customers.module.ts";

@Module({
  imports: [CustomersModule],
})
export class AppModule {}
```

</div>
<div class="col-span-6">

<Filename>modules/customers/customer.module.ts</Filename>

```ts
import { Module } from "@nestjs/common";
import { CustomersController } from "./customers.controller";
import { CustersService } from "./customers.service";

@Module({
  controllers: [CustomersController],
  providers: [CustersService],
})
export class CustomersModule {}
```

</div>
</div>

<div class="flex gap-4 text-6xl absolute bottom left">
    <div class="i-devicon-nestjs"/>
</div>

<PageNumber/>
