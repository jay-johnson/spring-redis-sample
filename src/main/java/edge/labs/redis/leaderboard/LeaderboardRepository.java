package edge.labs.redis.leaderboard;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LeaderboardRepository extends CrudRepository<Leaderboard, String> {

    Optional<Leaderboard> findById(String id);

}
