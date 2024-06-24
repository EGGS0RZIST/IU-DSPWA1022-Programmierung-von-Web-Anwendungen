---
layout: default
---

# Express <SubHeading text="Alternativen zu Java/Spring"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Das populärste und etablierteste Web-Framework für JavaScript ist [Express](https://expressjs.com/)
- [Link zur Live-Demo](https://expressjs.com/en/starter/hello-world.html)

</div>
<div class="col-span-12">

<Filename>index.js</Filename>

```js
const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req, res) => {
  res.send("Hello World!");
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
```

<Figcaption>"Hello World"-Webserver in Express</Figcaption>

</div>
</div>

<PageNumber/>
