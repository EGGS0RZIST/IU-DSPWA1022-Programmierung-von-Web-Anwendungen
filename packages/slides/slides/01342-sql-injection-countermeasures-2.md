---
layout: default
---

# SQL-Injection <SubHeading text="Gegenmaßnahmen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Zusätzlich sollten wir die entgegengenommenen Daten prüfen/validieren

</div>
<div class="col-span-6">

<Filename>customer.ts</Filename>

```js
import { isEmail } from './validation';

export function isCustomer(cus: any): cus is Customer {
  return typeof cus === 'object'
    && cus !== null
    && typeof cus.name === 'string'
    && !cus.name.includes(';')
    && isEmail(cus.email);
}
```

</div>
<div class="col-span-6">

<Filename>app.ts</Filename>

```js
import { isCustomer } from "./customer";

app.get("/better", async (req, res) => {
  if (!isCustomer(req.body)) {
    res.status(400).send("Invalid customer");
  }

  const result = await query(
    `
    insert into dspwa1022.customer (name, email)
    values ($1, $2)
    returning *
  `,
    [req.body.name, req.body.email],
  );
  res.json(result.rows);
});
```

</div>
</div>

<PageNumber/>
```
