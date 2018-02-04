package edge.labs.leaderboard;

import edge.labs.leaderboard.score.Score;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/leaderboards")
public class LeaderboardController {

    @GetMapping("/")
    public String leaderboardsPage(Model model) {

        List<Score> scores = Arrays.asList(
            new Score("medge", 1, LocalDateTime.now().minusDays(11)),
            new Score("tom", 42, LocalDateTime.now().minusDays(4)),
            new Score("ashley", 61255, LocalDateTime.now().minusDays(1))
        );
        Leaderboard test = new Leaderboard("EdgeLabs", scores);

        model.addAttribute("leaderboards", Arrays.asList(test)); // TODO
        return "index";
    }



}
