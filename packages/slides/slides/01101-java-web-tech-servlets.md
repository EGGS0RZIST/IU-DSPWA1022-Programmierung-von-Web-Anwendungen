---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Servlets <SubHeading text="Kurzüberblick"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Ein _Servlet_ ist eine Java-Klasse, die das `javax.servlet.Servlet`-Interface implementiert und die Methoden `doGet()` und `doPost()` bereitstellt, um die entsprechenden HTTP-Anfragen entgegenzunehmen

</div>
<div class="col-span-12">

```java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Hello, welcome to my servlet!</h1>");
        response.getWriter().write("</body></html>");
    }
}
```

</div>
</div>

<!-- <PageNumber/> -->
