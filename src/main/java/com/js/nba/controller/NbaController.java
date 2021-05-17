package com.js.nba.controller;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drmilk.nbawrapper.domain.League;
import com.drmilk.nbawrapper.domain.Team;
import com.drmilk.nbawrapper.domain.utils.scoreboard.GameDetails;
import com.drmilk.nbawrapper.domain.utils.scoreboard.Scoreboard;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.drmilk.nbawrapper.exception.TeamNotFoundException;
import com.js.nba.member.Member;

@Controller
@RequestMapping("/webPage")
public class NbaController {
	
//	@Autowired
//	Member member;
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		return request.getContextPath();
	}
	
	@RequestMapping("/todayMatch")
	public String todayMatch(Model model) {
		
		//view�� �������� ���� ��ü�� ����
		Member mem = new Member();
		
		model.addAttribute("member", mem);
		
		return "/webPage/todayMatch";
	}
	        
	@RequestMapping(value = "/todayMatchResult", method = RequestMethod.POST)
	public String todayMatchResult(@ModelAttribute("member") Member mem) throws ScoreboardNotFoundException, TeamNotFoundException {
		Scoreboard scoreboard = League.getScoreboard(mem.getDay(), mem.getMonth(), mem.getYear());
		List<GameDetails> gameList = scoreboard.getGames();
		
		for (int i = 0; i < gameList.size(); i++) {
			//visiting Team
			String visitTeam = gameList.get(i).getVisitingTeamScore().getTeamId(); 
			Team vteam = Team.getTeamById(visitTeam);
			
			//Home Team
			String homeTeam = gameList.get(i).getHomeTeamScore().getTeamId();
			Team hteam = Team.getTeamById(homeTeam);
			
			for (int j = 0; j < mem.getTeam().length; j++) {
				if (vteam.getFullName().equals(mem.getTeam()[j]) || hteam.getFullName().equals(mem.getTeam()[j])) {
					System.out.println(vteam.getFullName() + "  " + gameList.get(i).getVisitingTeamScore().getScore());
					System.out.println(hteam.getFullName() + "  " + gameList.get(i).getHomeTeamScore().getScore());
					System.out.println("------------------------------------------");
				}
				
			}
		}
		
		// �Է°��� ������� ��ü�� �ش� �信 �����ش�.
		return "/webPage/todayMatchResult";
	}
}
