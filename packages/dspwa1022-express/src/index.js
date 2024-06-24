import express from "express";
import * as path from "path";

const app = express();

app.use(express.json());
app.use("/static", express.static(path.join(__dirname, "public")));

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");
app.set("hits", 0);

app.get("/view", (req, res) => {
  res.render("index", {
    title: "Express View Rendering!",
    query: JSON.stringify(req.query),
  });
});

app.get("/", (req, res) => {
  res.send(
    `The counter is ${app.get("hits")}! Use POST /increment to increment the counter.`,
  );
});

app.post("/increment", (req, res) => {
  app.set("hits", app.get("hits") + 1);
  res.status(201).json({ hits: app.get("hits") });
});

app.post("/", (req, res) => {
  const data = req.body;
  res.send(`Got a POST request with data: ${JSON.stringify(data)}`);
});

app.listen(3000, () => {
  console.log("Server is running on http://localhost:3000");
});
