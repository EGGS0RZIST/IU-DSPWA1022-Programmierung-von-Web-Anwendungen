---
layout: default
---

# JavaScript <SubHeading text="Ausführung im Browser"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- JavaScript kann in jedem Webbrowser in der Konsole ausgeführt werden
- Außerdem können [`<script>`-Elemente](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/script) ausgeführt werden

</div>
<div class="col-span-12">

<Filename borderColor="var(--cm-string)">page.html</Filename>

<!-- prettier-ignore-start -->

```html
<script>
  console.log('This is an inline script')
</script>

<script src="./app.js"></script>
```

<Filename>app.js</Filename>

```js
console.log('This code is in an external js file')
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
