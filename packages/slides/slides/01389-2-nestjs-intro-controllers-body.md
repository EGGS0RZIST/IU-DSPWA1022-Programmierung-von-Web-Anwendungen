---
layout: default
---

# NestJS <SubHeading text="Controller"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit [`Body`](https://docs.nestjs.com/custom-decorators#param-decorators) können wir auf den HTTP-Request-Body zugreifen

</div>
<div class="col-span-12">

<Filename>modules/customers/customers.controller.ts</Filename>

<!-- prettier-ignore-start -->

```ts
@Controller("customers")
export class CustomersController {

  constructor(private service: CustomersService) {}
  
  @Post()
  getCustomer(
    @Body() payload: CreateCustomerDto
  ): Promise<Customer> {
    // ...
  }

}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
