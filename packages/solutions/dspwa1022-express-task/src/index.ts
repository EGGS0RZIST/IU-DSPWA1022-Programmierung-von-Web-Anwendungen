import express from "express";
import customers from "./data/customers";
import products from "./data/products";
import orders from "./data/orders";
import {query} from "./db";

const app = express();

app.use(express.json());

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

app.get("/customers/:id", (req, res) => {
  const customer = customers.find((c) => c.id === req.params.id);
  if (customer) {
    res.json(customer);
  } else {
    res.status(404).json({ message: "Customer not found" })
  }
});

app.get("/products", (req, res) => {
  res.json(products);
});

app.get("/products/:id", (req, res) => {
  const product = products.find((p) => p.id === req.params.id);
  if (product) {
    res.json(product);
  } else {
    res.status(404).json({ message: "Product not found" })
  }
});

app.get("/orders", (req, res) => {
  res.json(orders);
});

app.get("/orders/:id", (req, res) => {
  const order = orders.find((o) => o.id === req.params.id);
  if (order) {
    res.json(order);
  } else {
    res.status(404).json({ message: "Order not found" })
  }
});

app.get("/", (req, res) => {
  res.send("Hello from Express!");
});

app.post("/customers", async (req, res) => {
  const customer = req.body;
  const saved = await query(`
    insert into dspwa1022.customer (name, email)
    values ($1, $2)
    returning *
  `, [
    customer.name,
    customer.email
  ]);
  res.json(saved.rows[0]);
});

const port = 3000;
app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
