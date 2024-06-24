---
layout: default
---

# Imports <SubHeading text="Code-Organisation"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Wir können Code in mehrere Dateien aufteilen, indem wir diese gegenseitig importieren
- Mittels `export` und `import` können wir Code dateiübergreifend bereitstellen

</div>
<div class="col-span-6">

<Filename>Beispiel-Projekt-Struktur</Filename>

```js
/
├── app.ts
├── routes                // Enthält die HTTP-Endpunkte
│   ├── customer.ts
│   └── product.ts
├── models                // Enthält die Klassen/Interfaces
│   ├── customer.ts
│   └── product.ts
└── db
    └── pool.ts
```

</div>
<div class="col-span-6">

<Filename>app.ts</Filename>

```js
import express from "express";
import { query } from "./db/pool";

const app = express();

app.get("/customers", async (req, res) => {
  const result = await query("select * from customer");
  res.json(result.rows);
});
```

<div class="mt-2"></div>

<Filename>db/pool.ts</Filename>

```js
import { Pool } from "pg";

const pool = new Pool(/* ... */);

export async function query(sql: string, params?: any[]) {
  /* ... */
}
```

</div>
</div>

<!-- <PageNumber/> -->
