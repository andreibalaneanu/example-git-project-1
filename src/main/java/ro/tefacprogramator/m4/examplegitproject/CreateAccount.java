package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateAccount {
    
    @GetMapping("/create-account")
    public String createAccount() {
        return "Create account";
    }
}
