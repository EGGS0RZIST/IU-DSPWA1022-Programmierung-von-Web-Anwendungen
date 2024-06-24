---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Servlets <SubHeading text="Kurzüberblick"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Die Handler-Methode kann auch auf übergebene Parameter reagieren, um so eine personalisierte Antwort zu erzeugen: `POST /greet?name=Jane`

</div>
<div class="col-span-12">

```java
// imports...

public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }

        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Hello, " + name + "! Welcome to my servlet!</h1>");
        response.getWriter().write("</body></html>");
    }
}
```

</div>
</div>

<!-- <PageNumber/> -->
