---
layout: default
---

# Übung <SubHeading text="Kurs-Datenbank"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Für die folgenden Kapitel arbeiten wir mit der Shop-Datenbank, die gerade vorgestellt wurde
- Die Datenbank läuft nun nicht _In-Memory_ in der Java-Anwendung, sondern auf einem entfernten Server
- Die Zugangsdaten findet ihr unter [_My Campus_ > Lehrveranstaltung > Lehrmaterialien > _coursedb.txt_](https://mycampus.iubh.de/pluginfile.php/500496/mod_gfolder/content_77986/0/coursedb.txt?forcedownload=1)
- Kopiert die Datei [`.env.template`](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/.env.template) in eurem Projekt zu `.env` und setzt dort das Passwort ein (brauchen wir später für unsere Java-Anwendung)
- Nutzt nun ein Datenbank-Tool eurer Wahl, um euch mit der Datenbank zu verbinden, z.B.
  - [Table-Plus](https://tableplus.com/): [Download Verbindungsdatei](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/resources/coursedb/coursedb_student.tableplusconnection) (Import-PW: Kurs-Code (dspwa...))
  - IntelliJ: [Download Verbindungsdatei](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/tree/main/packages/resources/coursedb/intellij.dbconnection) (DB-PW muss ergänzt werden)

</div>
<div class="col-span-12">

- Verbindet euch mit der Datenbank und schaut euch die vorhandenen Tabellen und Daten an
- Beantwortet die folgenden Fragen
  - Was hat John am 04.04. gekauft? Welche Artikel und wie viel hat er ausgegeben?
  - Wie viele Bestellungen gab es im Mai? Welche Kunden haben bestellt?
  - Mit welchem Produkt wurde der meiste Umsatz gemacht? Wie viel?

</div>
</div>

<PageNumber/>

<!--

Antworten:

1. 2x Buch: 21,98€
2. 3 Bestellungen; John, Alice, Michael
3. 3 Bücher, 32.97

SQL:

- 2.1. select count(id) from dspwa1022."order" where created_at >= '2024-05-01' and created_at < '2024-06-01'
- 2.2. select distinct c.id, c.name from dspwa1022."order" o join dspwa1022.customer c on c.id = o.customer where o.created_at >= '2024-05-01' and o.created_at < '2024-06-01'
- 3. select p.id as product_id, p.name, p.price, sum(oi.quantity) as qty, sum(oi.quantity * p.price) as total from dspwa1022.order_item oi join dspwa1022.product p on oi.product = p.id group by p.id order by total desc

-->
