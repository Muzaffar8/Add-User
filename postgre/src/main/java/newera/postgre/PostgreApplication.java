package newera.postgre;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@SpringBootApplication
public class PostgreApplication {

	@Autowired
	private UsersRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(PostgreApplication.class, args);
	}


	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("users", repo.findAll());
		return "index";
	}
	@GetMapping("/about")
	public String aboutMe(){
		return "about";
	}





	}


