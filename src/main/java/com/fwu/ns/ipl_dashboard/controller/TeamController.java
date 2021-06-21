package com.fwu.ns.ipl_dashboard.controller;

import java.time.LocalDate;
import java.util.List;

import com.fwu.ns.ipl_dashboard.Model.Match;
import com.fwu.ns.ipl_dashboard.Model.Team;
import com.fwu.ns.ipl_dashboard.repository.MatchRepository;
import com.fwu.ns.ipl_dashboard.repository.TeamRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    

    public TeamController(TeamRepository teamRepository,MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }
     @GetMapping("/team")
     public Iterable<Team> getAllTeam(){
         return this.teamRepository.findAll();
     }
     
    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team = this.teamRepository.findByTeamName(teamName);
        // Pageable pageable = PageRequest.of(0, 4);
        // team.setMatches(matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName, teamName,pageable));
        team.setMatches(matchRepository.findLatestMatchesByTeam(teamName,4));
        return team;
        
    }
    @GetMapping("/team/{teamName}/matches")
    public List<Match> getMatchesForTeam(@PathVariable String teamName, @RequestParam int year)
    {
       LocalDate startDate = LocalDate.of(year, 1, 1);
       LocalDate endDate = LocalDate.of(year+1, 1, 1);
       return this.matchRepository.getMatchByTeamBetweenDates(teamName, startDate, endDate);

    //    return this.matchRepository.getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc( teamName, startDate, endDate,
    //        teamName,
    //        startDate,
    //        endDate
    //    );

    }
    
}
