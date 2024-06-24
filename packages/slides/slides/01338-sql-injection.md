---
layout: default
---

# SQL-Injection

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Wenn wir Nutzer-Input entgegennehmen (oder unvertrauenswürdige Daten im Allgemeinen), müssen wir deren Inhalt validieren
- Tun wir das nicht, kann sich ein API-Nutzer mit böser Absicht z.B. beliebigen Zugriff auf unsere Datenbank verschaffen

</div>
<div class="col-span-6">

<Filename borderColor="var(--cm-string)">app.ts</Filename>

```js
app.get("/injection", async (req, res) => {
  const result = await query(
    `
    select *
    from dspwa1022.customer
    where ${req.query.whereClause}
  `,
  );
  res.json(result.rows);
});
```

</div>
<div class="col-span-6">

<Filename>client.js</Filename>

```js
fetch(
  "https://example.com/injection?" +
    new URLSearchParams({
      whereClause: "1=1; DROP TABLE dspwa1022.customer;",
    }),
);
```

</div>
<div class="col-span-12">

> Beispiel für SQL-Injection. Schreibt NICHT solchen Code!

</div>
</div>

<PageNumber/>
