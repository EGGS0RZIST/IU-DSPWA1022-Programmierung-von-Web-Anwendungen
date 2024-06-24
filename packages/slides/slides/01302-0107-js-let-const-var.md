---
layout: default
---

# JavaScript <SubHeading text="var, let, const"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Variablen können mit [`var`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/var), [`let`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/let) oder [`const`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/const) deklariert werden
- Praxis: Nutzt `const` wenn möglich, ansonsten `let` - `var` wird nicht benötigt

</div>
<div class="col-span-6">

<Filename>var.js</Filename>

<!-- prettier-ignore-start -->

```js
var x = 1;
if (x === 1) {
  var x = 2;
  console.log(x); // 2
}

console.log(x); // 2
```

<!-- prettier-ignore-end -->

</div>
<div class="col-span-6">

<Filename>let.js</Filename>

<!-- prettier-ignore-start -->

```js
let x = 1;
if (x === 1) {
  let x = 2;
  console.log(x); // 2
}

console.log(x); // 1
```

<!-- prettier-ignore-end -->

</div>
<div class="col-span-12">

<Filename>const.js</Filename>

<!-- prettier-ignore-start -->

```js
const num = 42;
try {
  num = 99;
} catch (err) {
  console.log(err);  // TypeError: invalid assignment to const 'num'
}
console.log(num); // 42
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
