package com.social.social;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home(Principal principal) {
        return "Poprawne zalogowany użytkownik:"+principal.getName();
    }


    @GetMapping("/koduj")
    @ResponseBody
    public String koduj (@RequestParam String text){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String encode=encoder.encode(text);
        return encode;
    }


}
