package com.js.nba.dao;

import java.util.List;

import com.drmilk.nbawrapper.domain.utils.scoreboard.GameDetails;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.js.nba.member.Member;

public interface NbaIDao {
	List<GameDetails> NbaDateScore(Member mem) throws ScoreboardNotFoundException;
}
