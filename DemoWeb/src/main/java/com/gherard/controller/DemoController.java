package com.gherard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gherard.model.Persona;
import com.gherard.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //Lógica
    	
    	Persona p = new Persona();
    	p.setIdPersona(2);
    	p.setNombre("Roger");
    	repo.save(p);
    	
    	model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/listar")
    public String greeting(Model model) {
        //Lógica
    	
    	model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
	
}
