package com.excelr.restfulApi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/home")
    public String sayHello(){
        return "{name:Saikat}";
    }

    @GetMapping("/profile")
    public String Profile(){
        return "Hello You can change profile here!";
    }

    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String ProfileCreation(
           @RequestBody Profile profile){
        return profile.getId()+ "Profile created "+profile.getName()+" !";
    }
}


// PostMan : Application by which you can test any routes
// Create a store :
// get item : /items { product_id: 1, prouct_name:"Washing machine", price:123123 }
// insert item : /item { product_id: 1, prouct_name:"Washing machine", price:123123 }