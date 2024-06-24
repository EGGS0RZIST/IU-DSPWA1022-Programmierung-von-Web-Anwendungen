---
layout: default
---

# NestJS <SubHeading text="Services"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Services/Injectables werden genutzt, um Business-Logik zu bündeln und Controller-Code frei zu halten

</div>
<div class="col-span-12">

<Filename>modules/customers/customers.service.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Injectable } from "@nestjs/common";
import { Customer } from "../customer";
import { DatabaseService } from "../../db.service.ts";

@Injectable()                                                  // Macht den Service via Dependency-Injection nutzbar
export class CustomersService {

  constructor(
    private readonly db: DatabaseService                       // Nutzung eines allgemeines Injectables/Service
  ) {}
  
  getAll(): Promise<Customer[]> {
    return this.db.query('select * from customer');
  }

}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
