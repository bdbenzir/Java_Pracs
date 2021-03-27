import java.util.*;
class DiceAndCoin{
    public static int throwCoin(){
        int val = (int)(Math.random()+Math.random());
        return val;
    }
    public static int rollDice(){
        int val = (int)(6*Math.random() + 1);
        return val;
    }
    public static void main(String args[]){
        int dice,coin,sum,matchPoint=-1,f=1;
        while(true){
            dice=rollDice();
            coin=throwCoin();
            sum=dice+coin;
            System.out.print("Dice:"+dice);
            System.out.println("\tCoin:"+coin);
            if(dice==6 && coin==1 && f==1){
                System.out.println("The Player win");
                break;
            }
            else if(dice==1 && coin==0 && f==1){
                System.out.println("The Player Lose");
                break;
            }
            else if(dice==6 && coin==1 && f==0){
                System.out.println("The Player Lose");
                break;
            }
            else if(dice==1 && coin==0 && f==0){
                System.out.println("The Player Lose");
                break;
            }
            else if(sum==matchPoint){
                System.out.println("The Player win");
                break;
            }
            if(f==1){
                matchPoint=sum;
                f=0;
            }
        }
    }
}