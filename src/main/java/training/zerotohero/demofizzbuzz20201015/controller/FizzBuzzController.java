package training.zerotohero.demofizzbuzz20201015.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import training.zerotohero.demofizzbuzz20201015.service.FizzBuzzService;

@RestController
@RequestMapping("/api/v1.0")
public class FizzBuzzController {
    @Autowired
    private FizzBuzzService fizzBuzzService;

    @GetMapping("/fizzbuzz/validation/{number}")
    public String valifation(@PathVariable("number") int num ){
        return fizzBuzzService.validation(num);
    }

}
