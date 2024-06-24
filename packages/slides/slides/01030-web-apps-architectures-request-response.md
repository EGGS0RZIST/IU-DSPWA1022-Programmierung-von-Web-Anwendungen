---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Request-Response

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Klassicherweise interargieren _Client_ und _Server_ im _Request-Response_-Modus, also auf eine Anfrage folgt eine Antwort
- In der Regel erfolgt diese Kommunikation über [HTTP](https://developer.mozilla.org/en-US/docs/Web/HTTP)
  - Auf HTTP basieren verschiedene Verfahren wie [REST](https://developer.mozilla.org/en-US/docs/Glossary/REST) oder [GraphQL](https://graphql.org/)

</div>
<div class="col-span-6">

```mermaid
sequenceDiagram
    Client->>Server: GET /orders/42
    Server-->>Client: 200 OK { ... }
    Client->>Server: POST /orders/42/line-items
    Server-->>Client: 201 Created { ... }
    Client->>Server: ...
```

<Figcaption>Interaktion über eine REST-API</Figcaption>

</div>
</div>

<PageNumber/>

<!--
**REST: Representational State Transfer**

The basic idea of REST is that a resource, e.g. a document, is transferred via well-recognized, language-agnostic, and reliably standardized client/server interactions. Services are deemed RESTful when they adhere to these constraints.
-->
