package edge.labs.leaderboard;

import java.time.LocalDateTime;

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
