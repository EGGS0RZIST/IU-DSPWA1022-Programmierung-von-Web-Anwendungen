# Spring Data

> Diese Anleitung basiert auf der Nutzung von VS Code wie in der Vorlesung vorgeschlagen. Wenn du eine andere IDE verwendest, funktionieren gewisse Kommandos unter Umständen anders.

## Starten & Stoppen der Anwendung

- Öffne die Klasse [`SpringDataApp.java`](./SpringDataApp.java) und starte die `main()`-Methode

> Immer, wenn du Änderungen an der Anwendung vornimmst, musst du die Anwendung stopppen und neu starten. Das geht entweder über die _Mülltonne_ in der Konsole oder über die Tool-Leiste am oberen Rand von VS Code

_Variante 1: Terminal_

![Beenden der Spring App im Terminal](../../../../../../docs/images/spring-console-stop-app.png)

_Variante 2: Tool-Leiste_

![Beenden der Spring App über die Tool-Leiste](../../../../../../docs/images/spring-vscode-restart-app.png)

## Aufgaben (Teil 1)

> Verwende hier nur die `Person`-Klasse, den `PersonController` und das `PersonRepository`!

- Nutze den `GET /people`-Endpunkt, um die vorhandenen Personen abzurufen. Was ist das Ergebnis?
- Leg einige Personen mittels `POST /people` an
- Schau in die Konsole/die Logs der Anwendung. Was wird dort hinter `Hibernate:` ausgegeben?
- Was passiert, wenn du keinen `name` beim Anlegen mitgibst? Welche Informationen können wir aus den HTTP-Status-Codes ziehen?
- Erweitere die Person-Klasse um eine beliebige neue Eigenschaft und lies/schreib diese über die API

## Aufgaben (Teil 2)

> Diese Aufgaben basieren auf den `Department` und `Employee` Klassen!

- Nutze die Postman-Collection, um mit den `/api/departments`-Endpunkten zu interagieren
- Aktuell funktionierten nicht alle Endpunkte. Welche Fehlermeldungen und Status-Codes werden ausgegeben?
- Deine Aufgabe ist es, den Code so zu erweitern, dass auch die anderen Endpunkte in der Collection fehlerfrei laufen
