/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

/**
 *
 * @author Tania
 */
public class Player {
    int wins;    //# of wins
    int winTotal;
    /**
     * Randomly choose rock, paper, or scissors
     */
    public Player() {
    }
    
    public String playerChoice(){
        String choice="";
        int c= (int) (Math.random()*3);
        switch(c){
            case 0:
                choice=("rock");
                break;
            case 1:
                choice=("paper");
                break;
            case 2:
                choice=("scissors");
                break;
        }
        return choice;
    }

    public int getWins() {
        return (wins);
    }
   
    public int setWins() {
        int winTotal=wins++;
        return winTotal;
    }
    
    public static void comparacion(Player p1,Player p2){
        boolean gameWon=false;
        int roundsPlayed=0; //Number of rounds played
        int draw=0;
        
    do{           
            if((p1.playerChoice().equals("rock"))&&(p2.playerChoice().equals("paper"))){
                imprimir("2");
                p2.wins++; //trying a couple different ways to get count to work               
            }else if((p1.playerChoice().equals("paper"))&&(p2.playerChoice().equals("rock"))){
                p1.wins++;
                imprimir("1");
            }else if((p1.playerChoice().equals("rock"))&&(p2.playerChoice().equals("scissors"))){
                p1.wins=p1.setWins();
                imprimir("1");
            }else if((p1.playerChoice().equals("scissors"))&&(p2.playerChoice().equals("rock"))){
                p2.wins=p2.setWins();
                imprimir("2");
            }else if((p1.playerChoice().equals("scissors"))&&(p2.playerChoice().equals("paper"))){
                p1.wins=p1.setWins();
                imprimir("1");
            }else if((p1.playerChoice().equals("paper"))&&(p2.playerChoice().equals("scissors"))){
                p2.wins=p2.setWins();
                imprimir("2");
            }
            if(p1.playerChoice()==p2.playerChoice()){
                draw++;
                System.out.println("\n\t\t\t Draw \n");
            }
            roundsPlayed++;
            if((p1.getWins()>=3)||(p2.getWins()>=3)){
                gameWon=true;
                System.out.println("GAME WON");
            }
        }while(gameWon !=true);        
    }  
    

    private static void imprimir(String s) {
        System.out.println("Player "+s+" Wins");
    }
    
}
