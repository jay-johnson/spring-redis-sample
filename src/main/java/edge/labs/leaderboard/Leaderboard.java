package edge.labs.leaderboard;

import java.util.List;

public class Leaderboard {

    public final String gameName;
    public final List<Score> scores;

    public Leaderboard(String gameName, List<Score> scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public Leaderboard addScore(Score score) {
        scores.add(score);
        return this;
    }

    @Override
    public String toString() {
        return "Leaderboard{" +
            "gameName='" + gameName + '\'' +
            ", scores=" + scores +
            '}';
    }
}
