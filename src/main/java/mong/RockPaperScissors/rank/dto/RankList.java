package mong.RockPaperScissors.rank.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class RankList {
    private List<RankResponse> list;

    public RankList(List<RankResponse> list){
        this.list = list;
    }
}
