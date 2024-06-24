---
layout: default
---

# NestJS <SubHeading text="Datenbankanbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Auf der Service-Ebene können wir nun mittels Dependency-Injection die Repositories nutzen

</div>
<div class="col-span-12">

<Filename>customer.service.ts</Filename>

<!-- prettier-ignore-start -->

```ts
import { Injectable } from "@nestjs/common";
import { InjectRepository } from "@nestjs/typeorm";
import { Repository } from "typeorm";
import { Customer } from "./customer";

@Injectable()
export class CustomerService {
  constructor(
    @InjectRepository(Customer)
    private readonly customerRepository: Repository<Customer>,
  ) {}

  async findAll(): Promise<Customer[]> {
    return this.customerRepository.find();
  }

  async findOne(id: string): Promise<Customer> {
    return this.customerRepository.findOneBy({ id });
  }
}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
