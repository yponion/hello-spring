package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello") // localhost:8080/hello
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // resources -> templates -> hello.html
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){ // @RequestParam(value = "name", required = false) 로 필수값 뺄 수 있음
        model.addAttribute("name", name);
        return "hello-template";
    }
}
