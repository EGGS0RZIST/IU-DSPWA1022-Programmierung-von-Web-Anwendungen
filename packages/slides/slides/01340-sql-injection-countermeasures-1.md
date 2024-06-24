---
layout: default
---

# SQL-Injection <SubHeading text="Gegenmaßnahmen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Schreibe wenn möglich keine SQL-Queries, die aus ungeprüften Variablen aufgebaut werden
- Nutze stattdessen _Parameter_, dann übernimmt die Datenbank-Bibliothek (in unserem Falle [`node-postgres`](https://node-postgres.com/)) das korrekte, sichere Einsetzen in die Query

</div>
<div class="col-span-6">

<Filename borderColor="var(--cm-string)">app.ts</Filename>

```js
app.get("/bad", async (req, res) => {
  const result = await query(
    `
    insert into dspwa1022.customer (name, email)
    values ('${req.body.name}', '${req.body.name}')
    returning *
  `,
  );
  res.json(result.rows);
});
```

</div>
<div class="col-span-6">

<Filename>app.ts</Filename>

```js
app.get("/better", async (req, res) => {
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
