---
layout: default
---

# NestJS <SubHeading text="Controller"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit [`Param` und `Query`](https://docs.nestjs.com/custom-decorators#param-decorators) können wir auf die Parameter der HTTP-Anfrage zugreifen

</div>
<div class="col-span-12">

<Filename>modules/customers/customers.controller.ts</Filename>

<!-- prettier-ignore-start -->

```ts
@Controller("customers")
export class CustomersController {

  constructor(private service: CustomersService) {}
  
  @Get(':id')
  getCustomer(
    @Param('id') id: string,
    @Query('status') status?: string,
  ): Promise<Customer> {
    return this.service.getOne({
      customerId: id,
      filter: {
        byStatus: status
      }
    });
  }

}
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
