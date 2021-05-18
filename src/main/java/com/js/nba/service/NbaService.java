package com.js.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drmilk.nbawrapper.domain.Team;
import com.drmilk.nbawrapper.domain.utils.scoreboard.GameDetails;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.drmilk.nbawrapper.exception.TeamNotFoundException;
import com.js.nba.dao.NbaDao;
import com.js.nba.member.Member;

@Service
public class NbaService implements NbaIService {
	
	@Autowired
	NbaDao dao;

	@Override
	public ArrayList<String> FindScore(Member mem) throws ScoreboardNotFoundException, TeamNotFoundException {
		List<GameDetails> gameList = dao.NbaDateScore(mem);
		ArrayList<String> score = new ArrayList<String>(); 
		
		for (int i = 0; i < gameList.size(); i++) {
			//visiting Team
			String visitTeam = gameList.get(i).getVisitingTeamScore().getTeamId(); 
			Team vteam = Team.getTeamById(visitTeam);
			
			//Home Team
			String homeTeam = gameList.get(i).getHomeTeamScore().getTeamId();
			Team hteam = Team.getTeamById(homeTeam);
			
			for (int j = 0; j < mem.getTeam().length; j++) {
				// 선택한 팀이 vTeam,hTeam 중 하나 있으면
				if (vteam.getFullName().equals(mem.getTeam()[j]) || hteam.getFullName().equals(mem.getTeam()[j])) {
					score.add(vteam.getFullName() + "  " + gameList.get(i).getVisitingTeamScore().getScore());
					score.add(hteam.getFullName() + "  " + gameList.get(i).getHomeTeamScore().getScore());
					
					break;
				}
				
			}

		}
		return score;
		
	}
	
}
