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
        StringBuilder cv = new StringBuilder();
        cv.append("Name: Fari Qodri Andana\n");
        cv.append("Birthdate: 21 September 1999\n");
        cv.append("Birthplace: Jakarta\n");
        cv.append("Address: Kramat Jati\n");
        cv.append("\t---Education---\n");
        cv.append("Elementary School: SDI Muhammadiyah 2 Denpasar");
        cv.append("Junior High School: SMPN 8 Malang");
        cv.append("Senior High School: SMAN 8 Jakarta\n");
        cv.append("University: University of Indonesia\n");
        cv.append("---\tAbout Me---\n");
        cv.append("I like to code and have fun\n");
        cv.append("I am currently learning about Android\n");
        model.addAttribute("info", cv.toString());
        return "greeting";
    }
}