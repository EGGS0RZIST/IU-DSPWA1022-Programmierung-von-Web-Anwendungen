---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="Grundlagen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Bisher haben wir eine _In-Memory_ Datenbank ([_H2_](https://www.h2database.com/html/main.html)) verwendet
  - Vorteil: Einfache Integration ins Projekt, keine weitere Infrastruktur notwendig
  - Nachteil: Daten sind nach Stop der Anwendung verloren
- In einer echten Anwendung müssen die Daten vorhanden bleiben, daher trennt man Datenbank und Anwendung voneinander

</div>
<div class="col-span-12">

```mermaid
flowchart LR
    c(Client)
    api[API]
    db[(Database)]

    c ----> api
    api ----> db
    db -.-> api
    api -.-> c
```

</div>
</div>

<PageNumber/>
