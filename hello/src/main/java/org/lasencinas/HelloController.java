package org.lasencinas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(path = "/saludar")
	@ResponseBody
	public String saludo() {

		return "Hello World";
	}

}
