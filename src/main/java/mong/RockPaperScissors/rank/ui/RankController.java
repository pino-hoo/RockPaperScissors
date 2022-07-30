package mong.RockPaperScissors.rank.ui;

import lombok.RequiredArgsConstructor;
import mong.RockPaperScissors.rank.application.RankService;
import mong.RockPaperScissors.rank.dto.RankList;
import mong.RockPaperScissors.rank.dto.RankRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/rank")
public class RankController {
    private final RankService rankService;

    @GetMapping("/test")
    public String checkServer(){
        return "SERVER ON!!";
    }

    @PostMapping()
    public void save(@RequestBody RankRequest req){
        rankService.save(req);
    }

    @GetMapping()
    public RankList getRankList(){
        return rankService.getRankList();
    }
}
