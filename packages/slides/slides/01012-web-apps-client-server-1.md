---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Client-Server-Architektur <SubHeading text="Klassiches Modell"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Eine klassische Webanwendung arbeitet nach dem Client-Server-Modell
- Das **Frontend** läuft auf dem Gerät der Nutzenden, visualisiert Daten und nimmt Eingaben entgegen
- Das **Backend** ist ein Server, der über eine Schnittstelle (API) Daten entgegennehmen und ausgeben kann

</div>
<div class="col-span-6">

```mermaid
sequenceDiagram
    Frontend->>Backend: Please give me some data!
    Backend-->>Frontend: Here you go
    Frontend->>Backend: Here are some changes
    Backend-->>Frontend: Saved! Here is the updated data
    Frontend->>Backend: ...
```

</div>
</div>

<PageNumber/>
