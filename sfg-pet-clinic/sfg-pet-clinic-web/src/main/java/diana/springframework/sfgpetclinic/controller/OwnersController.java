package diana.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

	@RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
	public String getVets() {
		return "owners/index";
	}
}
