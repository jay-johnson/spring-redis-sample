package edge.labs.redis.leaderboard;

import edge.labs.redis.score.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/leaderboards")
public class LeaderboardController {

    LeaderboardRepository repository;

    @Autowired
    LeaderboardController(LeaderboardRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String leaderboardsPage(Model model) {
        model.addAttribute("leaderboards", repository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addLeaderboard(@RequestBody Leaderboard leaderboard) {
        repository.save(leaderboard);
        return "redirect:/leaderboards/";
    }

    @PostMapping("/{id}/scores/add")
    public String addScore(
        @PathVariable("id") String id,
        @RequestBody Score score) {

        repository.findById(id)
            .map(l -> l.addScore(score))
            .map(l -> repository.save(l))
            .orElseThrow(() -> new LeaderboardNotFound("Leaderboard " + id + " was not found"));

        return "redirect:/leaderboards/";
    }

}
