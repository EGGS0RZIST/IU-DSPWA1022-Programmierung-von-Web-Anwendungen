package org.iu.dspwa1022.springmvc;

import org.iu.dspwa1022.springmvc.lib.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentsController {

    @GetMapping("/comments")
    public String commentsForm(Model model) {
        model.addAttribute("comment", new Comment("", "1"));
        return "commentsForm";
    }

    @PostMapping("/comments")
    public String commentSubmit(@ModelAttribute Comment comment, Model model) {
        model.addAttribute("comment", comment);
        return "commentsResult";
    }

}
