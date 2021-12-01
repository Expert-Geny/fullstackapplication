package app.main.repository;

import app.main.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface RepositoryTask extends JpaRepository<Task,Long> {


}
