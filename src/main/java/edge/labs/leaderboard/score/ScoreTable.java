package edge.labs.leaderboard.score;

import javax.persistence.*;

@Entity
@Table(name = "scores")
public class ScoreTable {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Score score;

    ScoreTable() {/* for JPA */}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreTable{" +
            "id=" + id +
            ", score=" + score +
            '}';
    }
}
