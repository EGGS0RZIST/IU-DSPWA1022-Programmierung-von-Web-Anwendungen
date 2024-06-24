---
layout: default
---

# Übung <SubHeading text="Anlegen von Produkten und Bestellungen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Erweitert den [ProductController](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/controllers/ProductController.java), um Produkte anzulegen und zu bearbeiten (analog `CustomerController`)
- Der [OrderController](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/controllers/OrderController.java) erlaubt bereits das Anlegen von Aufträgen, allerdings muss dazu ein Objekt der Form `{ "customer" : { "id": "<uuid...>" } }` übergeben werden. Erweitert den Controller, damit man auch Ojekte der Form `{ "customer": "<uuid...>" }` verwenden kann.
  - Hinweis: Dazu benötigen wir eine neue Klasse (ein _Data Transfer Object (DTO)_), die die neue Struktur repräsentiert
- Bonus: Erlaubt außerdem das Erstellen von Bestellpositionen

</div>
</div>

<PageNumber/>
