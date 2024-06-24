---
layout: default
---

<!-- <Footer
    text="☕️ Java-Web-Technologien"
/> -->

# Spring MVC <SubHeading text="Formulare"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Bisher haben wir nur Daten vom Server abgerufen
- Für eine funktionsfähige Web-App müssen wir auch Daten schreiben können
- Mit Formularen können wir nun auch Daten entgegennehmen und diese in ein Java-Objekt speichern

</div>
<div class="col-span-6">

```html
<form
  class="comment-form"
  action="#"
  th:action="@{/comments}"
  th:object="${comment}"
  method="post"
>
  <label>Post-ID</label>
  <input type="number" th:field="*{postId}" />

  <label>Body</label>
  <input type="text" th:field="*{body}" />

  <button type="submit">Submit</button>
</form>
```

</div>
<div class="col-span-6">

```java
@Controller
public class CommentsController {

    @GetMapping("/comments")
    public String commentsForm(Model model) {
        model.addAttribute("comment", new Comment("", "1"));
        return "commentsForm";
    }

    @PostMapping("/comments")
    public String commentSubmit(
      @ModelAttribute Comment comment,
      Model model
    ) {
        model.addAttribute("comment", comment);
        return "commentsResult";
    }

}
```

</div>
</div>

<!-- <PageNumber/> -->
