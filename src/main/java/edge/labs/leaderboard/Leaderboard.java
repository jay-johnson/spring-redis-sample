package edge.labs.leaderboard;

import edge.labs.leaderboard.score.Score;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("leaderboard")
@Data
@NoArgsConstructor
@Accessors(fluent = true)
public class Leaderboard {

    public @Id String id;
    public String gameName;
    public @Reference List<Score> scores;

    public Leaderboard addScore(Score score) {
        scores.add(score);
        return this;
    }

}
