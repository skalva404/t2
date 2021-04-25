package com.fetchData.t2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {


    @Autowired
    FetchDataService fetchDataService;

    @GetMapping("/idm")
    public List<UserModel> getUsers() {
        return fetchDataService.findAll();

    }

    @GetMapping("/idm/{id}")
    public UserModel get(@PathVariable int id) throws Exception {
        Optional<UserModel> userModel = fetchDataService.findById(id);
        if (userModel.isPresent()) {
            return userModel.get();
        } else {
            throw new Exception("User Data Not Found For Given Id" + id);
        }
    }

    @PostMapping("/idm")
    public UserModel createUserData(@RequestBody UserModel userModel) {
        return fetchDataService.save(userModel);
    }

    @PutMapping("/idm/{id}")
    public UserModel update(@RequestBody UserModel userModel) {
        return fetchDataService.save(userModel);
    }

    @DeleteMapping("/idm/{id}")
    public String delete(@PathVariable int id) throws Exception {
        Optional<UserModel> userModel = fetchDataService.findById(id);
        if (userModel.isPresent()) {
            fetchDataService.delete(userModel.get());
            return "UserModel Data With id is Deleted" + id;
        } else {
            throw new Exception("User Data Not Found For Given Id" + id);
        }
    }
}