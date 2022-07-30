package mong.RockPaperScissors.rank.infrastructure;

import mong.RockPaperScissors.rank.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RankJpaRepository extends JpaRepository<Rank, Long> {
    List<Rank> findAllByOrderByScoreDesc(Pageable pageable);
}
