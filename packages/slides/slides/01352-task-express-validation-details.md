---
layout: default
---

# Übung <SubHeading text="Datenvalidierung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Erweitert die API um `POST`-Endpunkte, um in der Datenbank Kunden, Produkte und Bestellungen anzulegen (ignoriert zunächst die Relationen)
- Ergänzt Validierungs-Code, um sicherzustellen, dass die übergebenen Daten (Pfad- und Query-Parameter, Body) gültige Werte enthalten. Sinnvolle Prüfungen könnten sein:
  - Der eingegebene Wert enthält keine verdächtigen SQL-Zeichen (z.B. `;`, `--`)
  - Eine E-Mail enthält ein `@`
  - Der Preis ist eine postive Zahl
  - ...
- Gebt entsprechende Fehlercodes aus, wenn ungültige Eingaben kommen (z.B. `res.status(400).send('Invalid email')`)
- Testet eure API mit Postman

</div>
<div class="col-span-12">

</div>
</div>

<PageNumber/>
