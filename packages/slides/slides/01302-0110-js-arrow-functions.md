---
layout: default
---

# JavaScript <SubHeading text="Arrow-Functions"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- [Arrow function expressions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Arrow_functions?retiredLocale=de) sind eine Alternative zu klassischen Funktionen mit einigen Besonderheiten (kein [`this`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/this), [`arguments`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/arguments), [`super`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/super), [`yield`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/yield))
- Sie eignen sich hervorragend für _anonyme Funktionen_, etwa als Argument für Array-Methoden, o.ä.

</div>
<div class="col-span-12">

<Filename>arrow-function.js</Filename>

<!-- prettier-ignore-start -->

```js
const fun = (name) => {
  console.log(`My name is ${name}`);
}

const onelinerSum = (a, b) => a + b;

fun("Jane");
const sum = onelinerSum(1, 2); // 3

const fruits = ['apple', 'pear', 'melone', 'banana'];
const fruitNameLengths = fruits.map((f) => f.length); // 5, 4, 6, 6
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
