---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# MVC + Data <SubHeading text="Spring Framework"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Mit _Spring MVC_ können wir nun einfache datengetriebene Webseiten zu bauen
- Mit _Spring Data_ können wir Daten persistent speichern
- Durch Verknüpfen beider Konzepte können wir nun bereits eine voll funktionsfähige App bauen

</div>
<div class="col-span-12">

```mermaid
flowchart LR
    client(Client)
    ctrl[Controller]
    repo1[Repository A]
    repo2[Repository B]
    e1[Entity A]
    e2[Entity B]
    db[(Database)]

    client <--> ctrl
    ctrl <--> repo1
    ctrl <--> repo2
    repo1 <--> db
    repo2 <--> db

    repo1 -.- e1
    repo2 -.- e2

```

</div>
</div>

<PageNumber/>
