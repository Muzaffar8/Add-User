package newera.postgre;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Repository
@RestController
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestBody Users user) {
        usersRepository.save(user);
        return "OK";
    }


    @GetMapping("/all")
    public @ResponseBody
    Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id)
    {
        usersRepository.deleteStudentById(id);
        return "redirect:/";
    }



}
