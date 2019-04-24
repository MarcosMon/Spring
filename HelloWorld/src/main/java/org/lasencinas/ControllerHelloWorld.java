package org.lasencinas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerHelloWorld {
	@RequestMapping(path = "/saludo")
	@ResponseBody
	public String saluda() {
		return "Hello World";
	}

}
