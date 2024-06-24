---
layout: default
---

# JavaScript <SubHeading text="Funktionen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit [Funktionen](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions) können wir Code wiederverwendbar machen und Duplikate vermeiden
- Funktionen in JavaScript sind auch [Objekte](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Function) mit der speziellen Eigenschaft, dass sie _aufrufbar_ sind
- Funktionen können Argumente entgegennehmen und/oder Werte zurückgeben. In beiden Fällen sind die Datentypen nicht strikt festgelegt.

</div>
<div class="col-span-6">

<Filename>function.js</Filename>

<!-- prettier-ignore-start -->

```js
function noArgsReturnVoid() {
  console.log("function called ...");
}

function argsReturnVoid(name) {
  console.log(`the name is ${name}`);
}

function argsReturnNumber(a, b) {
  return a + b;
}
```

<!-- prettier-ignore-end -->

</div>
<div class="col-span-6">

<Filename>function.js (Fortsetzung)</Filename>

<!-- prettier-ignore-start -->

```js
function main() {
  noArgsReturnVoid();
  argsReturnVoid("Jane");
  let sum = argsReturnNumber(10, 9);               // 19
  let unintentional = argsRetunNumber("a", "b");   // "ab"

  argsReturnVoid();             // "the name is undefined"
}

main();
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
