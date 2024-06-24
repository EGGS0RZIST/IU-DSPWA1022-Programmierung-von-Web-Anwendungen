---
layout: default
---

# Express <SubHeading text="GET, POST, ..."/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Neben `GET`-Requests können wir ähnlich wie in Spring auch Daten via `POST` usw. entgegennehmen

</div>
<div class="col-span-7">

<Filename>index.js</Filename>

```js
const express = require("express");
const app = express();

// Required to parse JSON data
app.use(express.json());

app.get("/", (req, res) => {
  res.send("Hello World!");
});

app.post("/", (req, res) => {
  res.send(`Client sent data: ${JSON.stringify(req.body)}`);
});

// app.put(...), app.patch(...), app.delete(...)

app.listen(3000);
```

<Figcaption>GET, POST, usw. in Express</Figcaption>

</div>
<div class="col-span-5">

- Mit `app.use()` können wir [_Middlewares_](https://expressjs.com/en/guide/using-middleware.html) installieren
- [`express.json()`](https://expressjs.com/en/4x/api.html#express.json) verarbeitet die gesendeten Roh-Daten im JSON-Format und wandelt sie in nutzbare JavaScript-Objekte um

</div>
</div>

<PageNumber/>
