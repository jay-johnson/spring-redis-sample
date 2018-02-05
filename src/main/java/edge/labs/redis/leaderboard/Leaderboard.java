package edge.labs.redis.leaderboard;

import edge.labs.redis.score.Score;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("leaderboard")
@Data
@NoArgsConstructor
public class Leaderboard {

    public @Id String id;
    public String gameName;
    public @Reference List<Score> highScores;

}
