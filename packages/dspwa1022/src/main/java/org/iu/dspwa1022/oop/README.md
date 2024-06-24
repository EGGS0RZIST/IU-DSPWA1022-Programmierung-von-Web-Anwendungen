# OOP-Challenges

Dieses Projekt enthält einige Java-Coding-Challenges. Es ist wie folgt aufgebaut:

- In [`app/src/main/java/challenges`](./app/src/main/java/challenges) findet ihr den Quell-Code, den ihr bearbeiten sollt
- In [`app/src/test/java/challenges`](./app/src/test/java/challenges) finden sich die Tests, die automatisch euren Code prüfen
- Wir nutzen die Java Integration von VS-Code und können daher alle anderen vorhandenen Dateien vorerst ignorieren

## Setup und Projektstart

- Öffne zunächst [eine beliebige Java-Datei](./app/src/main/java/challenges/App.java), um die Java-Extension in VS Code zu aktivieren
- Öffne in der linken Seitenleiste das _Test_-Symbol
- Der Eintrag `app` sollte erscheinen
- Klicke auf _Play_ oder _Aktualisieren_, um die Tests laufen zu lassen
- Da wir noch keine Anpassungen im Code gemacht haben, sollten die meisten Tests fehlschlagen

## Code anpassen, damit Tests funktionieren

- Das Ziel ist es, euch wieder mit dem Programmieren in Java vertraut zu machen und einige grundlegende Aspekte der Sprache und des Objektorientierten Programmierens zu wiederholen
- Geht daher die fehlschlagenden Tests durch und behebt den Quell-Code (nicht den Test-Code), damit alle Tests erfolgreich werden
- Einige Stellen, an denen ihr aktiv werden müsst, sind mit `TODO` gekennzeichnet - bei anderen musst du selbst die Fehler suchen und finden

## Bonus-Aufgaben: Freie Coding-Aufgaben

- [Library](./app/src/main/java/challenges/Library/Library.java)
- [Instagram](./app/src/main/java/challenges/Instagram/Instagram.java)
- [Quiz](./app/src/main/java/challenges/Quiz/Quiz.java)
- Fortgeschritten: Spring Boot API
  - Erstelle ein Spring Boot Projekt (z.B. mit dem `Java: Create Java Project` Kommando in VS Code)
  - Du kannst die Logik aus einer der obigen Challenges in einer [HTTP-API](https://spring.io/guides/gs/rest-service) anbieten
  - Der nächste Schritt wäre dann die Erstellung einer grafischen Benutzeroberfläche im Browser, die deine API verwendet
