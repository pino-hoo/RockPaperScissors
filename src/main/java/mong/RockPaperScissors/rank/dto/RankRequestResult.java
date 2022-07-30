package mong.RockPaperScissors.rank.dto;

import lombok.Getter;

@Getter
public class RankRequestResult {
    private boolean status;
    private String reason;

    public RankRequestResult(boolean status, String reason){
        this.status = status;
        this.reason = reason;
    }
}
