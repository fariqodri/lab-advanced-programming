package hello;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = true)
                                   String name, Model model) {
        model.addAttribute("hello", "Hello, " + name + "!");
        if (name == null) {
            model.addAttribute("title", "This is my CV");
        } else {
            model.addAttribute("title", name + ", I hope you interested to hire me");
        }
        ArrayList<String> response = new ArrayList<>();
        response.add("Name: Fari Qodri Andana\n");
        response.add("Birthdate: 21 September 1999\n");
        response.add("Birthplace: Jakarta\n");
        response.add("Address: Kramat Jati\n");
        response.add("\t---Education---\n");
        response.add("Elementary School: SDI Muhammadiyah 2 Denpasar");
        response.add("Junior High School: SMPN 8 Malang");
        response.add("Senior High School: SMAN 8 Jakarta\n");
        response.add("University: University of Indonesia\n");
        response.add("---\tAbout Me---\n");
        response.add("I like to code and have fun\n");
        response.add("I am currently learning about Android\n");
        model.addAttribute("info", response);
        return "greeting";
    }
}