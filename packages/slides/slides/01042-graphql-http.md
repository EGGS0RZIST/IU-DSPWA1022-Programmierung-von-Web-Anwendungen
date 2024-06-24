---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# GraphQL <SubHeading text="Transport via HTTP"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Alle GraphQL-Aufrufe (_Queries_ und _Mutations_) werden als `POST`-Requests vom Client an den Server gesendet
- Das Format der Anfrage als auch der Antwort ist [_JSON_](https://de.wikipedia.org/wiki/JavaScript_Object_Notation)

</div>
<div class="col-span-12">

![GraphQL Query oder Mutation im JSON-Format](/images/graphql-json-request.png)

![GraphQL Antwort im JSON-Format](/images/graphql-json-response.png)

<Figcaption class="absolute top-[13rem] right-[2.8rem]">GraphQL Query oder Mutation im JSON-Format</Figcaption>
<Figcaption class="absolute top-[22.8rem] right-[2.8rem]">GraphQL Antwort im JSON-Format</Figcaption>

</div>
</div>

<PageNumber/>
