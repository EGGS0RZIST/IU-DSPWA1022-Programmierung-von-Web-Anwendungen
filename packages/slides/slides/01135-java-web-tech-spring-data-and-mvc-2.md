---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# MVC + Data <SubHeading text="Spring Framework"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Die _Templates_ stellen die Listenansicht und das Formular bereit
- Der _Controller_ verarbeitet die Anfragen und kommuniziert mit den _Repositories_
- Die _Repositories_ lesen und schreiben die Daten

</div>
<div class="col-span-12">

```mermaid
flowchart LR
    c(Client)
    ctrl[Controller]
    repo[Repository]
    db[(Database)]
    tpl[Template]

    c --> ctrl
    ctrl --> repo
    repo --> db
    db -.-> repo
    repo -.-> ctrl
    ctrl --> tpl
    tpl --> c
```

</div>
</div>

<PageNumber/>
