
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = String.valueOf(scan.nextLine());
        ArrayList<Game> gameData = new ArrayList<>();
        int numberOfGamesPlayed = 0;
        int numberOfWins = 0;
        int numberOfLoses = 0;
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                
                String[] lineData = line.split(",");
                
                String homeTeam = lineData[0];
                String visitingTeam = lineData[1];
                int homeTeamPoints = Integer.valueOf(lineData[2]);
                int awayTeamPoints = Integer.valueOf(lineData[3]);
                
                gameData.add(new Game(homeTeam, visitingTeam, homeTeamPoints, awayTeamPoints));
                
            }
            
            System.out.println("Team:");
            String teamSearched = scan.nextLine();
            
            for(Game g : gameData){
                if(g.getHomeTeam().equals(teamSearched)){
                    numberOfGamesPlayed +=1;
                    
                    if(g.getHomeTeamPoints() > g.getAwayTeamPoints()){
                        numberOfWins += 1;
                    }else{
                        numberOfLoses += 1;
                    }
                    
                } else if(g.getAwayTeam().equals(teamSearched)){
                    numberOfGamesPlayed +=1;
                    
                     if(g.getAwayTeamPoints() > g.getHomeTeamPoints()){
                        numberOfWins += 1;
                    }else{
                        numberOfLoses += 1;
                    }
                }
            }
            
            System.out.println("Games: " + numberOfGamesPlayed);
            System.out.println("Wins: " + numberOfWins);
            System.out.println("Losses: " + numberOfLoses);
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
