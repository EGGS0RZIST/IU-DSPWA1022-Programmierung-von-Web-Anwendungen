---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Java-Server-Pages <SubHeading text="Kurzüberblick"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Auch in JSP-Templates können Variablen verwendet werden, die dann vom Controller übergeben werden

</div>
<div class="col-span-6">

```html
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Greeting Page</title>
  </head>
  <body>
    <h1>Hello, ${name}! Welcome to my JSP page!</h1>
    <p>Current time is: <%= new java.util.Date() %></p>
  </body>
</html>
```

</div>
<div class="col-span-6">

```java
// import ...

public class GreetingController extends HttpServlet {
  @Override
  protected void doGet(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    String name = request.getParameter("name");
    if (name == null || name.isEmpty()) {
      name = "Guest";
    }

    request.setAttribute("name", name);

    RequestDispatcher dispatcher =
      request.getRequestDispatcher("greeting.jsp");
    dispatcher.forward(request, response);
  }
}
```

</div>
</div>

<!-- <PageNumber/> -->
