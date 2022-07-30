package mong.RockPaperScissors.rank.application;

import lombok.RequiredArgsConstructor;
import mong.RockPaperScissors.rank.domain.Rank;
import mong.RockPaperScissors.rank.dto.RankRequest;
import mong.RockPaperScissors.rank.infrastructure.RankJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RankService {
    private final RankJpaRepository rankJpaRepository;
    public void save (RankRequest req){
        rankJpaRepository.save(new Rank(req.getName(), req.getScore()));
    }

    public List<Rank> getRankList(){
        return rankJpaRepository.findAllByOrderByScoreDesc(
            PageRequest.of(0, 10)
        );
    }
}
