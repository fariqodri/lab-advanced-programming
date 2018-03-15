package hello;

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
        String cv = "Name: Fari Qodri Andana\n";
        cv += "Birthdate: 21 September 1999\n";
        cv += "Birthplace: Jakarta\n";
        cv += "Address: Kramat Jati\n";
        cv += "\t---Education---\n";
        cv += "Elementary School: SDI Muhammadiyah 2 Denpasar";
        cv += "Junior High School: SMPN 8 Malang";
        cv += "Senior High School: SMAN 8 Jakarta\n";
        cv += "University: University of Indonesia\n";
        cv += "---\tAbout Me---\n";
        cv += "I like to code and have fun\n";
        cv += "I am currently learning about Android\n";
        model.addAttribute("info", cv);
        return "greeting";
    }
}