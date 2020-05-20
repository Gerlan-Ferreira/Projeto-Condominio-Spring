package br.com.acme.multa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;

import br.com.acme.multa.model.Multa;
import br.com.acme.multa.service.MultaService;

@Controller
@RequestMapping("/multas")
public class MultaController {

	@Autowired
	private MultaService service;
	
	@GetMapping
	public ModelAndView lista (Multa multa) {
		
		ModelAndView modelo = new ModelAndView("multas");
		
	        modelo.addObject("multas", service.list());
		
		return modelo;
	}
	
	@GetMapping("/novo")
	public ModelAndView novo(Multa multa) {
		ModelAndView modelo = new ModelAndView("novas_multas");
		modelo.addObject("multas", multa);
		return modelo;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvar(@Valid Multa multa, BindingResult result, Model model, RedirectAttributes attributes){
		ModelAndView modelo = new ModelAndView("redirect:/multas");
		
		if (result.hasErrors()) {
			return novo(multa);
		}

		attributes.addFlashAttribute("mensagem", "Multa salva com sucesso");
		this.service.salvar(multa);
		return modelo;
	}
	
	@GetMapping("/multas")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("multas");
		return mv;
	}

}
