package pl.emcea.letsplaywebsite.models;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "pool_answers")
public class PoolAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String answer;
    private Integer votes;

    @ManyToOne
    @JoinColumn(name="pool_id", nullable=false)
    private Pool pool;

    public PoolAnswer() {
    }

    public PoolAnswer(String answer, Integer votes) {
        this.answer = answer;
        this.votes = votes;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPercent() {
        return this.votes*100/pool.getTotalVotes();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
