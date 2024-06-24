---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Java-Server-Pages <SubHeading text="Kurzüberblick"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Java-Server-Pages (JSPs) bauen im Kern auf _Servlets_ auf und erzeugen das _HTML_ auf Grundlage einer Template-Datei
- In das Template können Java-Ausdrücke eingebettet werden, um entsprechend dynamische Inhalte zu erzeugen

</div>
<div class="col-span-12">

```html
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple JSP Example</title>
  </head>
  <body>
    <h1>Hello, welcome to my JSP page!</h1>
    <p>Current server time is: <%= new java.util.Date() %></p>
  </body>
</html>
```

</div>
</div>

<PageNumber/>
