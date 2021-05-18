package com.js.nba.service;

import java.util.ArrayList;

import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.drmilk.nbawrapper.exception.TeamNotFoundException;
import com.js.nba.member.Member;

public interface NbaIService {
	ArrayList<String> FindScore(Member mem) throws ScoreboardNotFoundException, TeamNotFoundException;
}
