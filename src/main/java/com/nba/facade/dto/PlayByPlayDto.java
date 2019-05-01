package com.nba.facade.dto;

import com.nba.model.GameDetail;
import com.nba.model.Games;
import com.nba.model.Quarters;
import lombok.Data;

import java.util.List;

@Data
public class PlayByPlayDto {
    private Games game;

    private List<Quarters> quarters;

    private List<GameDetail> plays;
}
