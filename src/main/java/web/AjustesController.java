package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjustesController {

	
	
	@RequestMapping(value="/mnudebdcjm/")
	public String notasDebitoCreditoCartera( ){
		return "ajustes/notasdecartera";
	}
}