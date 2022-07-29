package mong.RockPaperScissors.rank.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "tbl_rank")
@EntityListeners(AuditingEntityListener.class)
public class Rank {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rank_id")
    private Long id;
    @Column(name = "rank_name")
    private String name;
    @Column(name = "rank_score")
    private Long score;

    @Column(name="rank_time")
    @CreatedDate
    private LocalDateTime createdDate;
    public Rank(String name, Long score) {
        this.name = name;
        this.score = score;
    }
}
