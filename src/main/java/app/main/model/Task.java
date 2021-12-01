package app.main.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Getter
@Setter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String summary;
    private String acceptanceCriateria;
    private String status;

    public Task(String summary, String acceptanceCriateria, String status) {
        this.summary = summary;
        this.acceptanceCriateria = acceptanceCriateria;
        this.status = status;
    }

    public Task() {

    }
}
