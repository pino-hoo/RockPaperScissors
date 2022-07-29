package mong.RockPaperScissors.rank.infrastructure;

import mong.RockPaperScissors.rank.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankJpaRepository extends JpaRepository<Rank, Long> {
}
