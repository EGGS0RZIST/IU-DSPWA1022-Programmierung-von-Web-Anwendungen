---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Spring MVC <SubHeading text="Einführung"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Das Spring-Framework bietet mit _Spring MVC_ die Möglichkeit, Anwendungen nach dem _Model-View-Controller_-Pattern zu bauen
- Der Ansatz ist dabei ähnlich wie bei _Servlets_ und _JSP_ und basiert auch teilweise technisch darauf
- Im untenstehenden Beispiel gibt der Controller den Namen `greeting` zurück, woraufhin die Datei `greeting.html` mit den übergebenen Parametern gerendert wird

</div>
<div class="col-span-6">

```html
<!-- greeting.html -->
<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
  <head>
    <title>Spring MVC</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <p th:text="|Hello, ${name}!|" />
  </body>
</html>
```

</div>
<div class="col-span-6">

```java
@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(
    @RequestParam(name="name", defaultValue="World")
    String name,
    Model model
  ) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
```

</div>
</div>

<!-- <PageNumber/> -->
