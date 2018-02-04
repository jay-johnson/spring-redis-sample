package edge.labs.leaderboard.score;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@RedisHash("persons")
@Data
@NoArgsConstructor
@Accessors(fluent = true)
public class Score {

    public @Id String id;
    public String username;
    public long score;
    public LocalDateTime scoreDateTime;

}
