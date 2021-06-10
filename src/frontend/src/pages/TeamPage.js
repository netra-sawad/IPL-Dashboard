import  {React, useEffect, useState } from 'react';
import { MatchDetailCard } from '../components/MatchDetailCard';
import { MatchSmallCard } from '../components/MatchSmallCard';

export const TeamPage = () => {

    // const [team, setTeam] = useState({});
    const[team,setTeam] = useState({matches :[]});
    // Here team is a state , setTeam is a way to populate it
    
    // Here, When the component loads with the empty array
    useEffect(
        () => {
            const fetchMatches = async () =>{
                const response = await fetch('http://localhost:8080/team/Chennai%20Super%20Kings');
                const data = await response.json();
                console.log(data);
                setTeam(data);
            };
            fetchMatches();

        }, []
    );
    return(
        <div className = "TeamPage">
            <h1> {team.teamName} </h1>
            <MatchDetailCard match={team.matches[0]}/>
            {team.matches.slice(1).map(match => <MatchSmallCard match={match} />)}
            {/* {team.matches && team.matches.map(match =>(<MatchSmallCard match = {match} />))} */}
                 </div>
    );
}