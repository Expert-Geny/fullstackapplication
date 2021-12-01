package app.main.controller;

import app.main.model.Task;
import app.main.repository.RepositoryTask;
import app.main.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.TabableView;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dash")
@CrossOrigin
public class Controller {

    @Autowired
    private Service service;

    //get
    @GetMapping("/all")
    public List<Task> list() {
        return service.listAll();
    }

    //get by id
    @GetMapping("/all/{id}")
    public  ResponseEntity<Task> getById(@PathVariable Long id){
        try {
            Task task = service.get(id);
            return new ResponseEntity<Task>(task,HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
        }
    }

    //post
    @PostMapping("/all")
    public void add(@RequestBody Task task){
        service.save(task);
    }

    //delete
    @DeleteMapping("/all/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }










}
