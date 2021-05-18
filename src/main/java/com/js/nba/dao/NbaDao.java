package com.js.nba.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drmilk.nbawrapper.domain.League;
import com.drmilk.nbawrapper.domain.utils.scoreboard.GameDetails;
import com.drmilk.nbawrapper.domain.utils.scoreboard.Scoreboard;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.js.nba.member.Member;

@Repository
public class NbaDao implements NbaIDao {
	
	private Scoreboard scoreboard;

	@Override
	public List<GameDetails> NbaDateScore(Member mem) throws ScoreboardNotFoundException {
		scoreboard = League.getScoreboard(mem.getDay(), mem.getMonth(), mem.getYear());
		List<GameDetails> gameList = scoreboard.getGames();
		
		return gameList;
	}
	
}
