package mong.RockPaperScissors.rank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RankRequest {
    private String name;
    private Long score;
}
