package com.nba.facade.vo;

import com.nba.model.News;
import lombok.Data;

import java.util.List;

@Data
public class NewsList {
    List<News> news;
}
