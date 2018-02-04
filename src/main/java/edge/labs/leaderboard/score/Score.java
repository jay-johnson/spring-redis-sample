package edge.labs.leaderboard.score;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Score {

    public final String username;
    public final long score;
    public final LocalDateTime scoreDateTime;

    public Score(String username, long score, LocalDateTime scoreDateTime) {
        this.username = username;
        this.score = score;
        this.scoreDateTime = scoreDateTime;
    }

    @Override
    public String toString() {
        return "Score{" +
            "username='" + username + '\'' +
            ", score=" + score +
            ", scoreDateTime=" + scoreDateTime +
            '}';
    }
}
