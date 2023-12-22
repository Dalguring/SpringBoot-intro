package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") // url에 입력된 path
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; // 렌더링 할 페이지 -> view Reslover가 resources:templates/ + {ViewName} + .html 파일 실행
    }
}
