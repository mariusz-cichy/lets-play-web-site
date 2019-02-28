package pl.emcea.letsplaywebsite.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "pools")
public class Pool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String question;
    private LocalDateTime start_date;
    private LocalDateTime end_date;

    @OneToMany(mappedBy = "pool", cascade = CascadeType.ALL)
    private Set<PoolAnswer> answers = new HashSet<>();

    public Pool(String question, LocalDateTime start_date, LocalDateTime end_date) {
        this.question = question;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }
}
