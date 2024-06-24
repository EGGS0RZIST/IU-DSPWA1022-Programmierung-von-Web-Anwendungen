---
layout: default
---

# CSS <SubHeading text="Kaskade"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- CSS-Styles können sich überlagern und überschreiben (daher der Name _Cascading Style Sheet_)
- Dabei werden die angewandten Styles nach ihrer [Spezifität](https://developer.mozilla.org/en-US/docs/Web/CSS/Specificity) gewichtet in absteigender Wertigkeit nach

| **Kategorie** | **Wert** | **Beispiel**                  |
| ------------- | -------- | ----------------------------- |
| _ID_          | 1-0-0    | `#example`                    |
| _class_       | 0-1-0    | `.my-class`, `[type="radio"]` |
| _type_        | 0-0-1    | `p`, `h1`                     |

</div>
<div class="col-span-4">

![Selektor-Spezifität](/images/css-cascade-devtools.gif){.border}

</div>
</div>

<PageNumber/>
