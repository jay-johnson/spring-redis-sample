package edge.labs.leaderboard.score;

import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository<Score, String> {
}
