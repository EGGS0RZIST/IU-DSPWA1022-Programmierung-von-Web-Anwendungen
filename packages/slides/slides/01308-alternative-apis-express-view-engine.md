---
layout: default
---

# Express <SubHeading text="View Engine"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit Express können wir auch dynamische Views rendern, ähnlich zu _Java Server Pages_

</div>
<div class="col-span-6">

<Filename>index.js</Filename>

```js
import express from "express";
import * as path from "path";

const app = express();

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");

app.get("/view", (req, res) => {
  res.render("index", {
    title: "Express View Rendering!",
    query: JSON.stringify(req.query),
  });
});

app.listen(3000);
```

<Figcaption>View-Rendering in Express</Figcaption>

</div>
<div class="col-span-6">

<Filename>views/index.ejs</Filename>

```html
<!doctype html>
<html>
  <head>
    <meta charset="utf-8" />
    <title><%= title %></title>
  </head>
  <body>
    <h2><%= title %></h2>
    <p>The query params are <%= query %></p>
  </body>
</html>
```

<Figcaption>"Embedded JavaScript" (EJS) Template</Figcaption>

</div>
</div>

<PageNumber/>

<!--

Alterantive View Engines:

- pug
- Handlebars

-->
