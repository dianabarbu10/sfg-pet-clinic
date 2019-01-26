package diana.springframework.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import diana.springframework.sfgpetclinic.services.OwnerService;

@Controller
public class OwnersController {
	@Autowired
	private OwnerService ownerService;

	@RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
	public String getVets(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
