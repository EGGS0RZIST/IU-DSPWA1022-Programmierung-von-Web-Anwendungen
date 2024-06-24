---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Microservices <SubHeading text="Architekturen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Alternativ kann man die verschiedenen Bestandteile der Anwendung aufteilen
- Vorteile
  - Services individuell skalierbar (horizontal & vertikal)
  - Modularität / Fehlerisolation
  - Technologische Unabhängigkeit
- Nachteile
  - Komplexeres Setup (Repository, Deployment, Hosting, Netzwerk)
  - Integrationstests unter Umständen schwierig
  - Komplexeres Loggng/Tracing

</div>
<div class="col-span-6">

```mermaid
%%{init: {"flowchart": {"htmlLabels": false}} }%%
flowchart TD
    c(🙋‍♀️ Client)
    capi{{Customer API}}
    docs{{Documents Service}}
    notifications{{Notifications Service}}
    api{{External APIs}}

    c <--> capi
    c <--> docs
    capi <-.-> notifications
    capi <-..-> api
    notifications <-..-> api
    docs <-..-> api
```

<Figcaption>Beispiel für eine Microservice-Architektur</Figcaption>

</div>
</div>

<PageNumber/>
