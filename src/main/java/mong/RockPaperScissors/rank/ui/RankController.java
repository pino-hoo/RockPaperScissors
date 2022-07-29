package mong.RockPaperScissors.rank.ui;

import lombok.RequiredArgsConstructor;
import mong.RockPaperScissors.rank.application.RankService;
import mong.RockPaperScissors.rank.dto.RankRequest;
import mong.RockPaperScissors.rank.dto.RankResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<RankResponse> getRankList(){
        return rankService.getRankList().stream().map(rank -> new RankResponse(rank)).collect(Collectors.toList());
    }
}
