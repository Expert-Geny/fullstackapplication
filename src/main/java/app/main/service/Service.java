package app.main.service;

import app.main.model.Task;
import app.main.repository.RepositoryTask;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private RepositoryTask repo;

    public List<Task> listAll(){
        return repo.findAll();
    }

    public void save(Task task){
        repo.save(task);
    }

    public Task get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }







}
