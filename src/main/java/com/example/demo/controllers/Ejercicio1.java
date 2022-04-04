package com.example.demo.controllers;

import com.example.demo.utils.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio1 {
    // http://localhost:8080/
   @GetMapping("/") 
    public String greet(){
        return "Bienvenido al servidor";
    }
    // http://localhost:8080/aleatorio
    @GetMapping("/aleatorio")    
    public String generateRandom(){
        int r= (int)(Math.random()*100);
        return r + "";
    }
    // http://localhost:8080/palindromo/ana
    @GetMapping("/palindromo/{name}")
    public String palindrome(@PathVariable String name){
       boolean palindrome = Utils.isPalindrome(name); 
       return palindrome ? "Es palindromo" : "No es palindromo";
        // if(name.equals(reversedName)) return "Si es un palindromo";
       // else return "No es un palindromo";
    }

    
}
