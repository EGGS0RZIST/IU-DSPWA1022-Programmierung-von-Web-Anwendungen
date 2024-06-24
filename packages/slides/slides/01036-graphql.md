---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# GraphQL <SubHeading text="Alternative zu REST"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-10">

- APIs werden heute häufig nicht mit REST, sondern als _GraphQL_-API aufgebaut
- Grundidee ist der Zusammenhang zwischen allen Objekten in einem System über einen _Graph_ (also 1:1-, 1:n-, ... Verbindungen)
- Eine GraphQL-API bietet die Möglichkeit, verschaltete Strukturen abzurufen und nur genau die Daten zu erhalten, die man benötigt
- Die Struktur der Antwort (_Response_) spiegelt immer die Struktur der Anfrage (_Query_)

</div>
<div class="col-span-12">

![](/images/graphql-query-response.gif){.max-h-48 .-mt-8}

</div>
</div>

<PageNumber/>
