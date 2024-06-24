---
layout: default
---

# Routen <SubHeading text="Code-Organisation"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit dem Express-[`Router`](https://expressjs.com/en/guide/routing.html#express-router) können wir die HTTP-Routen aufteilen und in eigenen Dateien organisieren

</div>
<div class="col-span-6">

<Filename>app.ts</Filename>

```js
import express from "express";
import customerRoutes from "routes/customer";

const app = express();
const router = express.Router();

router.use(customerRoutes);

app.listen(/* ... */);
```

</div>
<div class="col-span-6">

<Filename>routes/customers.ts</Filename>

```js
import express from "express";

const router = express.Router();

router.get("/customers", async (req, res) => {
  /* ... */
});

router.get("/customers/:id", async (req, res) => {
  /* ... */
});

export default router;
```

</div>
</div>

<!-- <PageNumber/> -->
