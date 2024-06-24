---
layout: default
---

# JavaScript <SubHeading text="Promises"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- [Promises](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) werden genutzt, um asynchronen Code auszuführen (z.B. HTTP, ...) oder für Code, der möglicherweise fehlschlägt (z.B. Dateien lesen und schreiben)
- Promises können drei Zustände haben: `pending`, `fulfilled`, `rejected`
- Mit `.then()`, `.catch()` und `.finally()` können wir auf das Ergebnis reagieren

</div>
<div class="col-span-12">

<Filename>promise.js</Filename>

<!-- prettier-ignore-start -->

```js
const myPromise = new Promise((resolve, reject) => {
  if (Math.random() < .5) {
    resolve();
  } else {
    reject();
  }
});

myPromise
  .then(() => console.log('success!'))
  .catch(() => console.log('failure!'))
  .finally(() => console.log('promise has resolved'));
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
