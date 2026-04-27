package org.example.controller;

import org.example.model.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/new-style")
public class RestAPIHttpMethodDirectController {

    @GetMapping(path = "/users/info")
    public String getAllData(){
        return "Returns all users Data";
    }

    @GetMapping(path = "/users/info/{id}")
    public String getInfoById(@PathVariable int id){
        return "Returns all users based on ID";
    }

  /*  @PostMapping(path = "/users/info")
    public String createUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        String lastName = (String)requestData.get("lastName");
        return "Create new user";
    }*/

    @PostMapping(path = "/users/info")
    public String createUser(@RequestBody Employee requestData){
        String firstName = requestData.getFirstName();
        String lastName = requestData.getLastName();
        return "Create new user";
    }



    @PutMapping(path = "/users/info")
    public String putUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        String lastName = (String)requestData.get("lastName");
        return "Full update complete for user with ID 101";
    }

    @PatchMapping(path = "/users/info")
    public String patchUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        return "Partial update complete for ID 101";
    }

    @DeleteMapping(path = "/users/info")
    public String deleteUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        return "Partial update complete for ID 101";
    }


}
