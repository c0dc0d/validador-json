package br.com.tecban.validadorjsonweb.controllers;

import br.com.tecban.validadorjsonweb.model.JsonModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.nio.charset.StandardCharsets;

@Controller
public class JsonValidadorController {

    @GetMapping("/json-validador")
    public String inicializaForm(Model model) {
        model.addAttribute("jsonModel", new JsonModel());
        return "json-validador";
    }

    @PostMapping("/json-validador")
    public String executaValidacaoSubmit(@ModelAttribute JsonModel json, Model model) {
        byte[] bytes = json.getJson().getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
        model.addAttribute("jsonModel", json);
        return "result";
    }

}