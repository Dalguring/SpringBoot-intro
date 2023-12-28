package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("hello-string")
    @ResponseBody // html의 body부분이 아닌 http 바디부에 데이터를 직접 입력하겠다는 뜻
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);

        return hello; // @ResponseBody 어노테이션을 선언하고 객체를 반환하면 스프링에서는 기본적으로 json객체로 반환해준다
                      // @ResponseBody 어노테이션이 있으면 HttpMessageConverter이 동작하여 반환값의 타입에 따라 JsonConverter, StringConverter가 동작
    }
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
