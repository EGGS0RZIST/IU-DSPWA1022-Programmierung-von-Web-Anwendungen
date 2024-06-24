---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Client-Server-Architektur <SubHeading text="Klassiches Modell"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Das **Backend** übernimmt üblicherweise die geschützte Kommunikation mit Datenquellen und anderen angeschlossenen Diensten
- So hat das **Frontend** keinen direkten Zugriff auf die Datenquellen; so werden üblicherweise Berechtigungssysteme umgesetzt

</div>
<div class="col-span-6">

```mermaid
sequenceDiagram
    Frontend->>Backend: Please give me some data!
    Backend->>Database: SELECT * FROM ...
    Database-->>Backend: [ { ... }, { ... } ]
    Backend-->>Frontend: Here you go
    Frontend->>Backend: Here are some changes
    Backend->>Database: UPDATE ... SET ... WHERE ...
    Database-->>Backend: ok
    Backend-->>Frontend: Saved! Here is the updated data
    Frontend->>Backend: ...
```

</div>
</div>

<PageNumber/>
