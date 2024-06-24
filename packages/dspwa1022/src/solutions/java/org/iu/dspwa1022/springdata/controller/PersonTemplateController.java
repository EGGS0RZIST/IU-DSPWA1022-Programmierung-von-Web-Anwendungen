package org.iu.dspwa1022.springdata.controller;

import org.iu.dspwa1022.springdata.model.Person;
import org.iu.dspwa1022.springdata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PersonTemplateController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public String getAllPeople(Model model) {
        final var people = personRepository.findAll();
        model.addAttribute("people", people);
        model.addAttribute("person", new Person());
        return "people";
    }

    @PostMapping
    public String createPerson(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/people";
    }
}
