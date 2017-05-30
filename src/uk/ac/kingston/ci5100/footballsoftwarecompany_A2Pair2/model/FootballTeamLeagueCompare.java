/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.footballsoftwarecompany_A2Pair2.model;

import java.util.Comparator;

/**
 *
 * @author Anas Adurker
 */
public class FootballTeamLeagueCompare  implements Comparator<FootballTeam>{
    
    public FootballTeamLeagueCompare(){    
    }

    /**
     *
     * @param team1
     * @param team2
     * @return
     */
    @Override
    public int compare(FootballTeam team1, FootballTeam team2){
        return team1.getLeague().compareTo(team2.getLeague());
        
    }
}
