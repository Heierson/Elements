package com.elements.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ElementController {

    @Autowired
    private ElementRepository ElementRepository;

    @GetMapping("/")
    public String LandingPage (Model model) {
        List<Element> elements = ElementRepository.findAll();
        model.addAttribute("elements", elements);
        return "landingPage";
    }
}
