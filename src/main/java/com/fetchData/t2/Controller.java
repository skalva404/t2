package com.fetchData.t2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {


    @Autowired
    private FetchDataService fetchDataService;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GetMapping(value = "/idm", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUsers() {
        return gson.toJson(fetchDataService.findAll());
    }

    @GetMapping(value = "/idm/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserModel get(@PathVariable int id) throws Exception {
        Optional<UserModel> userModel = fetchDataService.findById(id);
        if (userModel.isPresent()) {
            return userModel.get();
        } else {
            throw new Exception("User Data Not Found For Given Id" + id);
        }
    }

    @PostMapping(value = "/idm", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserModel createUserData(@RequestBody UserModel userModel) {
        return fetchDataService.save(userModel);
    }

    @PutMapping(value = "/idm/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserModel update(@RequestBody UserModel userModel) {
        return fetchDataService.save(userModel);
    }

    @DeleteMapping(value = "/idm/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
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