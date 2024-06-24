---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Client-Server-Architektur <SubHeading text="Technologien"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Das **Backend** ist eine serverseitige Anwendung, die in vielen verschiedenen Sprachen und Frameworks umgesetzt werden kann (_Java_, _JS_, _Python_, _Rust_, _Go_, _C_/_C++_/_C#_, ...)
- Im **Browser** ist der Technologiestack im Kern derselbe: _HTML_, _CSS_, _JavaScript_
- Im **Datenbankbereich** hängt die Technologieauswahl maßgeblich von der Art der Daten und den Anforderungen ab (relational, Graphen, dokumentenbasiert, ...)

</div>
<div class="col-span-6">

```mermaid
flowchart TD
    a(Client)
    s{{Server}}
    db[(Database)]

    a <---> s
    s <-..-> db
```

</div>
</div>

<div class="i-devicon-html5 text-3xl absolute right-[20rem] top-[5.7rem]"></div>
<div class="i-devicon-css3 text-3xl absolute right-[17rem] top-[5.7rem]"></div>
<div class="i-devicon-javascript text-3xl absolute right-[14rem] top-[5.7rem]"></div>

<div class="i-devicon-javascript text-3xl absolute right-[20rem] top-[14.4rem]"></div>
<div class="i-devicon-java text-3xl absolute right-[17rem] top-[14.4rem]"></div>
<div class="i-devicon-python text-3xl absolute right-[14rem] top-[14.4rem]"></div>
<div class="i-devicon-rust text-3xl absolute right-[11rem] top-[14.4rem]"></div>
<div class="i-devicon-go text-3xl absolute right-[8rem] top-[14.4rem]"></div>
<div class="i-devicon-c text-3xl absolute right-[5rem] top-[14.4rem]"></div>
<div class="text-2xl absolute right-[2rem] top-[14.4rem]">...</div>

<div class="i-devicon-postgresql text-3xl absolute right-[20rem] top-[24.2rem]"></div>
<div class="i-devicon-mysql text-3xl absolute right-[17rem] top-[24.2rem]"></div>
<div class="i-devicon-neo4j text-3xl absolute right-[14rem] top-[24.2rem]"></div>
<div class="i-devicon-firebase text-3xl absolute right-[11rem] top-[24.2rem]"></div>
<div class="text-2xl absolute right-[8rem] top-[24.2rem]">...</div>

<PageNumber/>
