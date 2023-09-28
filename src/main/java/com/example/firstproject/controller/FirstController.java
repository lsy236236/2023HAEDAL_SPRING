package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model 클래스 자동 임포트 , nicetomeetyou 메서드에 적으면 된다.
import org.springframework.web.bind.annotation.GetMapping;


@Controller //어노테이션으로 컨트롤러 선언. 자동으로 임포트된다.
public class FirstController {

    @GetMapping("/hi") //url 요청 접수 , localhost:8080/hi로 접속하면 mustache 파일 찾아서 반환
    public String niceToMeetYou(Model model) { //model "상윤"을 "username"에 연결해 웹 브라우저로 보냄

        model.addAttribute("username","sungyun");
        return "greetings"; //서버가 알아서 templates에서 mustache 파일 찾아옴, 페이지 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","상윤");
        return "goodbye";
    }
} //반환문 활용해서 페이지 반환할 수 있게 해줌
//컨트롤러 먼저 선언(@Controller)하고, 반환 해줄 페이지 이름 따서(return "gretting";) 적고 url 요청( @GetpMapping("/hi"))해야용

