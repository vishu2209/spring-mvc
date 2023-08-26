package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("https://www.google.com");
//		return redirectView;

		return "";
	}

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second handler[enjoy]");
		return "contact";
	}

}
