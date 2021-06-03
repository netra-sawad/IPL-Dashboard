package com.fwu.ns.ipl_dashboard.repository;

import com.fwu.ns.ipl_dashboard.Model.Team;

import org.springframework.data.repository.CrudRepository;


public interface TeamRepository extends CrudRepository<Team,Long>
{

    Team findByTeamName(String teamName);  
    
}
