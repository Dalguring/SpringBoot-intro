package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") // url에 입력된 path
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; // 렌더링 할 페이지 -> view Reslover가 resources:templates/ + {ViewName} + .html 파일 실행
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
}
