package edge.labs.leaderboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
@RequestMapping("/leaderboards")
public class LeaderboardController {

    @GetMapping("/")
    public String leaderboardsPage(Model model) {
        model.addAttribute("leaderboards", Collections.emptyList()); // TODO
        return "index";
    }



}
