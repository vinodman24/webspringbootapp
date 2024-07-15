package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(description = "User API", name = "User Services")
@Controller
public class SpringController 
{
@GetMapping(path="/hello-world")
public String helloWorld()
{
	try { 
		 TimeUnit.SECONDS.sleep(65); 
		 } catch (InterruptedException e) {
	 System.out.println("Thread interrupted"); 
	 }
return "Response after sleep";
}

@GetMapping("/users")
@Operation(summary = "Returns all users", tags = {"User",},
        responses = {
                @ApiResponse(responseCode = "200",
                        description = "Returns all users",
                        content = @Content(mediaType = "application/json",
                                schema = @Schema(implementation = User.class)))
        })
@ResponseBody
public List<User> getAllUsers() {
	
	 try { 
		 TimeUnit.SECONDS.sleep(65); 
		 } catch (InterruptedException e) {
	 System.out.println("Thread interrupted"); 
	 }
	 List<User> users = new ArrayList<>();
     users.add(new User(1, "John Doe"));
     users.add(new User(2, "Dow"));
     return users;
	 
}

}
