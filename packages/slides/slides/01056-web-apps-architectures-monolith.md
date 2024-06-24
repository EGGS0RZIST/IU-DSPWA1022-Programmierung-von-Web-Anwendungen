---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Monolith <SubHeading text="Architekturen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Die bisherigen Beispiele zeigten ein _monolithisches Modell_, bei dem es _einen_ Server gibt, der sämtliche Aufgaben bewältigt
- Vorteile
  - Einfache Code-Basis und einfacher Betrieb
  - Einfaches Testing
- Nachteile
  - Skaliert nur als Ganzes
  - Möglicherweise nicht _stateless_ und damit nicht horizontal skalierbar

</div>
<div class="col-span-6">

```mermaid
%%{init: {"flowchart": {"htmlLabels": false}} }%%
flowchart TD
    c(🙋‍♀️ Client)
    c2(🙋‍♀️ ...)
    c3(🙋‍♀️ ...)
    s{{"`**Server**
    API, Documents Service, Notifications, ...`"}}
    api{{External APIs}}

    c <--> s
    c2 <--> s
    c3 <--> s
    s <-..-> api
```

<Figcaption>Beispiel für die monolithische Architektur</Figcaption>

</div>
</div>

<PageNumber/>
