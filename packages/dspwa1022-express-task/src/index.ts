import express from "express";
import customers from "./data/customers";

const app = express();

/**
 * - Wir wollen perspektivisch die Kurs-Datenbank (mit Produkten, Kunden, Bestellungen) über eine Express-API bereitstellen
 * - Die eigentliche Datenbank-Verbindung ignorieren wir vorerst und arbeiten mit Dummy-Daten
 * - Es gibt bereits eine Klasse und Demo-Daten für Kunden, sowie eine Route, um alle Kunden zurückzugeben
 * 
 * TODO:
 * - Implementiere eine Route, die einen Kunden anhand der ID zurückgibt
 * - Füge Klassen für Produkte, Bestellungen und Bestellpositionen hinzu und überlege dir Demo-Daten
 * - Implementiere eine Route, die alle Produkte zurückgibt
 * - Implementiere eine Route, die ein Produkt anhand der ID zurückgibt
 * - Implementiere Routen, um alle oder eine Bestellung zurückzugeben (inkl. Positionen)
 */

app.get("/customers", (req, res) => {
  res.json(customers);
});

app.get("/", (req, res) => {
  res.send("Hello from Express!");
});

const port = 3000;
app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
