package mong.RockPaperScissors.rank.application;

import lombok.RequiredArgsConstructor;
import mong.RockPaperScissors.rank.domain.Rank;
import mong.RockPaperScissors.rank.dto.RankList;
import mong.RockPaperScissors.rank.dto.RankRequest;
import mong.RockPaperScissors.rank.dto.RankRequestResult;
import mong.RockPaperScissors.rank.dto.RankResponse;
import mong.RockPaperScissors.rank.infrastructure.RankJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class RankService {
    private final RankJpaRepository rankJpaRepository;

    public RankRequestResult save (RankRequest req){
        String name = req.getName();
        Long score = req.getScore();

        if(name == null || name.length() == 0){
            name = "ㅇㅇ";
        }

        if(score == null || score < 0){
            return new RankRequestResult(
                false,
                "점수가 음수일 순 없습니다."
            );
        }

        rankJpaRepository.save(new Rank(name, score));
        return new RankRequestResult(
            true,
            ""
        );
    }

    public RankList getRankList(){
        return new RankList(
            rankJpaRepository.findAllByOrderByScoreDesc(
                PageRequest.of(0, 10)
            )
                .stream()
                .map(RankResponse::new)
                .collect(Collectors.toList())
        );
    }
}
