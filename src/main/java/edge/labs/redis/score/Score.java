package edge.labs.redis.score;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@RedisHash("score")
@Data
@NoArgsConstructor
public class Score {

    public @Id String id;
    public String username;
    public long score;
    public LocalDateTime scoreDateTime;

}
