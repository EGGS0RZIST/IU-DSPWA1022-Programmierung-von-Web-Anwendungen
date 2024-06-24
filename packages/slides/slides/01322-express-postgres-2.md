---
layout: default
---

# Express <SubHeading text="Datenbank-Anbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Den Datenbank-Zugriffs-Code können wir in eine zentrale Datei auslagern
- Die Express-Routen (oder anderen Teilen der Anwendung) können dann diesen Code nutzen

</div>
<div class="col-span-6">

<Filename>db/index.ts</Filename>

```ts
import pg from "pg";
const { Pool } = pg;

const pool = new Pool({
  host: "database.host.com",
  database: "database-name"
  user: "database-user",
  password: "database-password",
  ssl: true
});

export function query(text: string, params: any[]) {
  return pool.query(text, params);
}
```

</div>
<div class="col-span-6">

<Filename>index.ts</Filename>

```ts
import express from "express";
import { query } from "./db";

const app = express();

app.get("/customers", async (req, res) => {
  const customers = await query(`select ... `);
  res.json(customers);
});
```

</div>
</div>

<PageNumber/>
