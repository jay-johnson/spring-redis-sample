package edge.labs.leaderboard;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class LeaderboardNotFound extends RuntimeException {

    public LeaderboardNotFound(String message) {
        super(message);
    }

}
