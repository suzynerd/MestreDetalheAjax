package controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProdutosController {
	
	@RequestMapping(value="/produtos", produces="text/plain")
	@ResponseBody
	public String produtos(@RequestParam("cliente")String cliente){
		if("001".equalsIgnoreCase(cliente.trim())){
			return "001,Computador,2.000,1+001,Computador,4.000,2";
		}
		else if("002".equalsIgnoreCase(cliente.trim())){
			return "002,Celular,1.110,2";
		}
		else if("003".equalsIgnoreCase(cliente.trim())){
			return "003,Mouse,50.00,3";
		}
		else if("004".equalsIgnoreCase(cliente.trim())){
			return "004,Notebook,2.100,1";
		}		
		return "";
	}
}
