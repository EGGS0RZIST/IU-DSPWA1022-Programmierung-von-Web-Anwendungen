---
layout: default
---

<style>
  td, th {
    padding: .1rem 0 !important;
    max-width: 1rem !important;
  }

  tr {
    background: transparent !important;
  }
</style>

# JavaScript <SubHeading text="Datentypen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- In JavaScript gibt es sieben primitive Datentypen
- Variablen haben keinen festgelegten Typ und können jederzeit neu zugewiesen werden

</div>
<div class="col-span-6">

| **Typ**                                                                                             | **typeof**  | **Wrapper**                                                                                           |
| --------------------------------------------------------------------------------------------------- | ----------- | ----------------------------------------------------------------------------------------------------- |
| [Null](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#null_type)           | `object`    |                                                                                                       |
| [Undefined](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#undefined_type) | `undefined` |                                                                                                       |
| [Boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#boolean_type)     | `boolean`   | [`Boolean`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean) |
| [Number](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#number_type)       | `number`    | [`Number`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)   |
| [BigInt](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#bigint_type)       | `bigint`    | [`BigInt`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt)   |
| [String](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#string_type)       | `string`    | [`String`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)   |
| [Symbol](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#symbol_type)       | `symbol`    | [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol)   |

</div>
<div class="col-span-6">

<Filename>datatypes.js</Filename>

<!-- prettier-ignore-start -->

```js
let nothing = null;
let dontKnow = undefined;
let yes = true;
let no = false;
let age = 42;
let much = Infinity;
let oops = NaN;
let bigNum = 9007199254740991n;
let text = "hello";            // typeof text === 'string'
let sym = Symbol("unique");

text = 5;                      // typeof text === 'number'
text = null;                   // typeof text === 'object'
text = false;                  // typeof text === 'boolean'
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
