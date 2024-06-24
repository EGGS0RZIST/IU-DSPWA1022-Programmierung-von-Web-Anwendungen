---
layout: default
---

# Express <SubHeading text="Datenbank-Anbindung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Wie auch in unserer Java-Anwendung schreiben wir die Datenbank-Zugangsdaten (und andere Geheimnisse) **niemals** direkt in den Quell-Code, sondern stellen diese über _Umgebungsvariablen_ bereit
- So können wir auch zwischen verschiedenen Umgebungen (lokal, Testing, Produktion) unterscheiden
- Da wir _Bun_ nutzen, können wir ohne Weiteres eine `.env`-Datei einlesen und die Werte dort nutzen (siehe [Docs](https://bun.sh/docs/runtime/env))

</div>
<div class="col-span-6">

<Filename>db/index.ts</Filename>

```ts
import pg from "pg";
const { Pool } = pg;

const pool = new Pool({
  host: process.env.DB_HOST,
  database: process.env.DB_DATABASE,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  ssl: true,
});

export function query(text: string, params: any[]) {
  return pool.query(text, params);
}
```

</div>
<div class="col-span-6">

<Filename>.env</Filename>

```sh
DB_HOST=database.host.com
DB_DATABASE=database-name
DB_USER=database-user
DB_PASSWORD=database-password
```

</div>
</div>

<PageNumber/>
