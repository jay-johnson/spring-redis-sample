package edge.labs.leaderboard.score;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<ScoreTable, Long> {
}
