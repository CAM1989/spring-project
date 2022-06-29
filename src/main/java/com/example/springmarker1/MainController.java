package com.example.springmarker1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    //GET [http://localhost:8189/app]/
    @GetMapping("/first")
    @ResponseBody
    public Integer doSomething1() {
        return 100;
    }

    @GetMapping("/second")
    @ResponseBody
    public Integer doSomething2() {
        return 200;
    }

//    http://localhost:8189/app/add?a= &b=
    @GetMapping("/add")
    @ResponseBody
    public Integer doSomethingAdd(@RequestParam int a,@RequestParam int b) {
        return a+b;
    }

    //    http://localhost:8189/app/sub?a= &b=
    @GetMapping("/sub")
    @ResponseBody
    public Integer doSomethingSub(@RequestParam int a,@RequestParam int b) {
        return a-b;
    }

    @GetMapping("/page")
    public String showMyPage() {
        return "data";
    }
}
