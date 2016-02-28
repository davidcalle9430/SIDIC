package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasesController {
	@RequestMapping(value="/bases/")
	public String bases(){
		return "bases/bases";
	}
}
