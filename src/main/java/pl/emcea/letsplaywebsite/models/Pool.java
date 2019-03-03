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
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pool", cascade = CascadeType.ALL)
    @OrderBy("votes desc")
    private Set<PoolAnswer> answers = new HashSet<>();

    public Pool() {
    }

    public Pool(String question, LocalDateTime startDate, LocalDateTime endDate, Set<PoolAnswer> answers) {
        this.question = question;
        this.startDate = startDate;
        this.endDate = endDate;
        this.answers = answers;
    }

    public Integer getTotalVotes() {
        int totalVotes = 0;
        for (PoolAnswer answer: answers) {
            totalVotes += answer.getVotes();
        }
        return totalVotes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Set<PoolAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<PoolAnswer> answers) {
        this.answers = answers;
    }
}
