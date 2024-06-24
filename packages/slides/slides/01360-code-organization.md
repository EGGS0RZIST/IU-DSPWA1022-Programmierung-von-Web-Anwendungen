---
layout: default
---

# Code-Organisation

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Bisher haben wir den meisten Code direkt in die `index.ts`-Datei geschrieben
- So mischen wir verschiedene Bereiche und Belange des Programms: Models/Klassen, Server-Setup, Datenbank-Zugriff, ...
- Es macht Sinn, diese Teile sauber zu trennen, um den Code übersichtlicher und wartbarer zu machen

</div>
<div class="col-span-6">

<Filename>app.ts</Filename>

```js
const app = express();
app.use(/* ... */);

const pool = new Pool(/* ... */);

async function query(/* ... */) {
  /* ... */
}

app.get(/* ... */);
app.post(/* ... */);
app.patch(/* ... */);

app.listen(/* ... */);
```

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
</div>

<!-- <PageNumber/> -->
