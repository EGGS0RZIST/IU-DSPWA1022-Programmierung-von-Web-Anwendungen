---
layout: default
---

# JavaScript <SubHeading text="async/await"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit [`async/await`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function) können wir mit einer saubereren, leserlicheren Syntax mit Promises arbeiten

</div>
<div class="col-span-12">

<Filename>async-await.js</Filename>

<!-- prettier-ignore-start -->

```js
function resolveAfter2Seconds() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve('resolved');
    }, 2000);
  });
}

async function asyncCall() {
  console.log('calling');                            // sofort
  const result = await resolveAfter2Seconds();
  console.log(result);                               // nach 2 Sek.
}

asyncCall();
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
