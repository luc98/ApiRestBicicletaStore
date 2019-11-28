package com.curso.escuela.BicicletaStore;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BController {


	@RequestMapping(value="/bicicleta",method= RequestMethod.GET)
	public Bicicleta getBicicleta() {
		Bicicleta b1 =new Bicicleta();
		b1.setId(12L);
		b1.setMarca("una marca");
		b1.setModelo("unModelo");
		b1.setPrecio(10000L);
		return b1;
	}

}
