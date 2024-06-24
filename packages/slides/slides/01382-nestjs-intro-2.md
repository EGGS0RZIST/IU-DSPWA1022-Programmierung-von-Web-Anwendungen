---
layout: default
---

# NestJS <SubHeading text="Intro"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Der Projektaufbau in NestJS ist vergleichbar mit einem Spring Projekt: Es gibt Controller, Services, Module, usw.
- Je nach Team, Projektgröße, usw. kann der Aufbau variieren, es empfiehlt sich allgemein aber das Einhalten einer Struktur

<Filename>Beispiel-NestJS-Struktur</Filename>

```js
src
├── main.ts                              // Einstiegspunkt (erstellt Webserver, Haupt-Modul)
├── app.module.ts                        // Code wird thematisch in Module aufgeteilt (gebündelt hier)
├── modules
│   ├── customers
│   │   ├── customers.controller.ts      // Enthält HTTP-Endpunkte
│   │   ├── customers.service.ts         // Business-Logik, DB-Zugriff
│   │   └── customer.ts                  // Klassen-Definition
│   └── products
│       └── ...
└── db
    └── pool.ts                          // Allgemeiner Code kann neben den Modulen existieren
```

</div>
</div>

<div class="flex gap-4 text-6xl absolute bottom left">
    <div class="i-devicon-nestjs"/>
</div>

<PageNumber/>
