---
layout: default
---

# Express <SubHeading text="Daten speichern"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Wir können nun Daten aus der Datenbank abrufen - das Schreiben von Daten ist ebenso schnell umgesetzt

</div>
<div class="col-span-6">

<Filename>index.ts</Filename>

```js
app.post("/customers", async (req, res) => {
  const customer = req.body;
  const saved = await query(
    `
    insert into dspwa1022.customer (name, email)
    values ($1, $2)
    returning *
  `,
    [customer.name, customer.email],
  );
  res.json(saved.rows[0]);
});
```

</div>
<div class="col-span-6">

<Filename>JSON</Filename>

```json
{
  "id": "27189286-d35c-437a-b595-7fbb3380ebf2",
  "created_at": "2024-06-09T14:03:36.568Z",
  "name": "Mr. API",
  "email": "api@abc.com"
}
```

</div>
<div class="col-span-12">

> Achtung: In einer echten Anwendung sollten wir niemals ungefiltert Nutzer-Input direkt an die Datenbank geben!

</div>
</div>

<PageNumber/>
