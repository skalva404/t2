package com.fetchData.t2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@Autowired
	FetchDataService fetchDataService;
	
	@GetMapping("/getdata")
	public List<UserModel> getUsers() {
		return fetchDataService.findAll();
		
	}
	
	@GetMapping("/getdata/{id}")
	public UserModel get(@PathVariable int id) throws Exception {
		Optional<UserModel> userModel = fetchDataService.findById(id);
		if(userModel.isPresent()) {
			return userModel.get();
		}
		else {
			throw new Exception("User Data Not Found For Given Id"+id);
		}
	}
	
	@PostMapping("/getdata")
	public UserModel createUserData(@RequestBody UserModel userModel) {
		return fetchDataService.save(userModel);
	}
	
	@PutMapping("/getdata/{id}")
	public UserModel update(@RequestBody UserModel userModel) {
		return fetchDataService.save(userModel);
	}
	
	@DeleteMapping("/getdata/{id}")
	public String delete(@PathVariable int id) throws Exception {
		Optional<UserModel> userModel = fetchDataService.findById(id);
		if(userModel.isPresent()) {
			fetchDataService.delete(userModel.get());
			return "UserModel Data With id is Deleted"+id;
		}
		else {
			throw new Exception("User Data Not Found For Given Id"+id);
		}
	}
}