package org.example.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/old-style")
public class RestAPIDemoController {

    @RequestMapping(path = "/users/info", method = RequestMethod.GET)
    public String getAllData(){
        return "Returns all users Data";
    }

    @RequestMapping(path = "/users/info/{id}", method = RequestMethod.GET)
    public String getInfoById(@PathVariable int id){
        return "Returns all users based on ID";
    }

    @RequestMapping(path = "/users/info", method = RequestMethod.POST)
    public String createUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        String lastName = (String)requestData.get("lastName");
        return "Create new user "+firstName + "   "+ lastName;
    }

    @RequestMapping(path = "/users/info", method = RequestMethod.PUT)
    public String putUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        String lastName = (String)requestData.get("lastName");
        return "Full update complete for user with ID 101";
    }

    @RequestMapping(path = "/users/info", method = RequestMethod.PATCH)
    public String patchUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        return "Partial update complete for ID 101";
    }

    @RequestMapping(path = "/users/info", method = RequestMethod.DELETE)
    public String deleteUser(@RequestBody Map<String, Object> requestData){
        String firstName = (String)requestData.get("firstName");
        return "Delete of user for ID 101 is competed" ;
    }


}
