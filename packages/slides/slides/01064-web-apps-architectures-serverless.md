---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Serverless <SubHeading text="Architekturen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- In den bisherigen Beispielen waren die Services als dauerhaft verfügbare Einheiten betrieben (deployed), das heißt, die Server laufen dauerhaft
- Um Spitzen abzufangen (z.B. viele Bestellungen am Black-Friday) können Services skaliert werden
- Alternativ kann ein Dienst auch komplett _serverless_ betrieben werden und nur bei Bedarf hochgefahren werden
- Beispiele: [Firebase](https://firebase.google.com/docs/functions), [Google Cloud Functions](https://cloud.google.com/functions), [AWS Lambda](https://aws.amazon.com/de/lambda/), [Azure Functions](https://azure.microsoft.com/de-de/products/functions)

</div>
<div class="col-span-6">

```js
const { onRequest } = require("firebase-functions/v2/https");
const moment = require("moment");

exports.date = onRequest(
  { timeoutSeconds: 1200, region: ["eu-west3"] },
  (req, res) => {
    if (req.method !== "GET") {
      res.status(403).send("Forbidden!");
      return;
    }

    let format = req.query.format;
    if (!format) {
      format = req.body.format;
    }

    const formattedDate = moment().format(`${format}`);
    res.status(200).send(formattedDate);
  },
);
```

<Figcaption>Beispiel für eine Firebase-Function</Figcaption>

</div>
</div>

<PageNumber/>
