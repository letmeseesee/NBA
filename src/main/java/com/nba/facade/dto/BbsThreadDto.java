package com.nba.facade.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * bbs_thread
 * @author 
 */
@Data
public class BbsThreadDto implements Serializable {
    private Integer tid;

    private Integer type;

    private Integer uid;

    private String subject;

    private Integer createDate;

    private Integer lastDate;

    private Integer views;

    private Integer posts;

    private Boolean closed;

    private String userName;

    private static final long serialVersionUID = 1L;
}