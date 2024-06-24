---
layout: default
---

# NestJS <SubHeading text="Controller"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- In Controllern werden die HTTP-Routen definiert

</div>
<div class="col-span-12">

<Filename>modules/customers/customers.controller.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Controller, Get } from "@nestjs/common";
import { Customer } from "../customer";
import { CustomersService } from "./customers.service.ts";

@Controller("customers")                               // URL-Pfad: `/customers/...`
export class CustomersController {

  constructor(
    private readonly service: CustomersService         // Dependency Injection (ähnlich @Bean/@Autowired in Spring)
  ) {}
  
  @Get()                                               // HTTP GET
  findAll(): Promise<Customer[]> {
    return this.service.getAll();
  }

}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
