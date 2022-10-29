package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cart {
    
    @GetMapping("/shopping-cart")
    public String cart() {
        return "My cart page";
    }
}
