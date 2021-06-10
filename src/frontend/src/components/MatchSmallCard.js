import { React } from 'react'

export const MatchSmallCard = ({match}) => {
    return(
        <div className="MatchSmallCard">
          <p>{match.team1} vs {match.team2}</p>
          {/* <p>{matches.team1} vs {matches.team2}</p> */}
        </div>
    );
}