package doing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {



    @RequestMapping("hellow")
    @ResponseBody
    public String hello(){
        return "hellow";
    }
}
