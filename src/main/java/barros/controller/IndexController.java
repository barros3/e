package barros.controller;

import javax.inject.Inject;

import barros.model.Index;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	@Inject
	Result result;
	
	@Get("/")
	public void index(){
		result.include("messagem", "Ola MUNDO VRAPTOR!!");
	}
}
