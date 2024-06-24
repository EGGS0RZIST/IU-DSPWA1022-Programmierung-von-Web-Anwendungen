---
layout: default
---

# SQL-Injection <SubHeading text="Gegenmaßnahmen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Es existieren auch Pakete wie [`class-validator`](https://github.com/typestack/class-validator), um Objekte und ihre Eigenschaften zu validieren

</div>
<div class="col-span-6">

<Filename>customer.ts</Filename>

```ts
import { IsEmail, IsNotEmpty } from "class-validator";

export class CreateCustomerDto {
  @IsNotEmpty()
  name: string;

  @IsEmail()
  email: string;
}
```

<Figcaption>Klasse mit Decorators beschreibt Validierungs-Regeln</Figcaption>

</div>
<div class="col-span-6">

```json
{
  "name": "Customer Name",
  "email": 42
}
```

<Figcaption>Fehlerhafter Input</Figcaption>

```json
{
  "statusCode": 400,
  "error": "Bad Request",
  "message": ["email must be an email"]
}
```

<Figcaption>Beispiel-Fehlermeldung</Figcaption>

</div>
</div>

<PageNumber/>
```
