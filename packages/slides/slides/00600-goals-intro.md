---
layout: section
---

<EmojiTitle title="Fahrplan" emoji="🚌">
  Was ich euch vermitteln möchte
</EmojiTitle>

<div class="absolute top right flex flex-col gap-4">
  <Card
    v-click
    title="🎁 Objektorientierte Programmierung"
    description="Grundlagen, Wiederholung"
  />
  <Card
    v-click
    title="🌍 Grundlagen betrieblicher Webanwendungen"
    description="Architekturen, Herausforderungen"
  />
  <Card
    v-click
    title="🔐 Backend-Entwicklung mit Java & Spring Boot"
    description="Model-View-Controller, APIs, DB-Zugriff, ..."
  />
  <Card
    v-click
    title="💻 Frontend-Entwicklung im Browser"
    description="JavaScript, TypeScript, Frameworks, ..."
  />
  <Card
    v-click
    title="🔮 Projekt"
    description="Eigene Full-Stack-App entwickeln"
  />
</div>

<div class="absolute top right-[28.6rem] flex flex-col gap-4">
  <Card
    v-click
    title="👷 Praxisteil I"
    highlight
    description="IDE-Einrichtung, Coding-Challenges"
  />
</div>

<PageNumber/>
