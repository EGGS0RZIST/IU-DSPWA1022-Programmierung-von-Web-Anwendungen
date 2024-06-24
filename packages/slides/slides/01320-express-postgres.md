---
layout: default
---

# Express <SubHeading text="Datenbank-Anbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Zur Anbindung von Datenbanken stehen verschiedene Pakete zur Verfügung, für unsere Postgres-Datenbank nutzen wir [`node-postgres`](https://node-postgres.com/)
- Mit einem [`Pool`](https://node-postgres.com/apis/pool) richten wir die Verbindung ein; mit diesem können wir dann Anfragen an die Datenbank schicken

</div>
<div class="col-span-12">

<Filename>index.js</Filename>

```js
import pg from "pg";
const { Pool } = pg;

const pool = new Pool({
  host: "database.host.com",
  database: "database-name"
  user: "database-user",
  password: "database-password",
  ssl: true
});

const result = await pool.query("select * from dspwa1022.customer");

console.log(result.rows[0].name); // Jane Doe
```

</div>
</div>

<PageNumber/>
