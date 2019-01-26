package diana.springframework.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import diana.springframework.sfgpetclinic.services.VetService;

@Controller
public class VetsController {
	@Autowired
	private VetService vetService;

	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String getVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
