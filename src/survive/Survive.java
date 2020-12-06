
package survive;

import java.util.Random;
import java.util.Scanner;
import jaco.mp3.player.MP3Player;
import java.io.File;

public class Survive {
    //inventory
    public static int logs=0;
    public static int cans=0;
    public static int water=0;
    public static int money=0;
    public static int healthPack=0;
    
    //equipment
    public static String weapon="fist";
    public static int damage=1;
    public static String armour="leather";
    public static int defence=1;
    
    //health
    public static int warmth=10;
    public static int hunger=10;
    public static int thirst=10;
    public static int health=100;
    
    
    
    public static int progression=0;
    public static boolean victory=false;
    //methods
    
    public static boolean checkLife(){
        if (warmth<=0|hunger<=0|thirst<=0|health<=0){
            return false;
        }else{
            return true;
        }
    }
    
    public static void picture(){
        System.out.println("░░░░░░░░░░░░░░░░██████████████████\n" +
                           "░░░░░░░░░░░░████░░░░░░░░░░░░░░░░░░████\n" +
                           "░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                           "░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                           "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                           "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                           "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                           "░░░░░░░░██░░░░██████░░░░██░░░░██████░░░░██\n" +
                           "░░░░░░░░░░██░░░░░░░░░░██████░░░░░░░░░░██\n" +
                           "░░░░░░░░████░░██░░░░░░░░░░░░░░░░░░██░░████\n" +
                           "░░░░░░░░██░░░░██████████████████████░░░░██\n" +
                           "░░░░░░░░██░░░░░░██░░██░░██░░██░░██░░░░░░██\n" +
                           "░░░░░░░░░░████░░░░██████████████░░░░████\n" +
                           "░░░░░░░░██████████░░░░░░░░░░░░░░██████████\n" +
                           "░░░░░░██░░██████████████████████████████░░██\n" +
                           "░░░░████░░██░░░░██░░░░░░██░░░░░░██░░░░██░░████\n" +
                           "░░░░██░░░░░░██░░░░██████░░██████░░░░██░░░░░░██\n" +
                           "░░██░░░░████░░██████░░░░██░░░░██████░░████░░░░██\n" +
                           "░░██░░░░░░░░██░░░░██░░░░░░░░░░██░░░░██░░░░░░░░██\n" +
                           "░░██░░░░░░░░░░██░░██░░░░░░░░░░██░░██░░░░░░░░░░██\n" +
                           "░░░░██░░░░░░██░░░░████░░░░░░████░░░░██░░░░░░██\n" +
                           "░░░░░░████░░██░░░░██░░░░░░░░░░██░░░░██░░████\n" +
                           "░░░░░░░░██████░░░░██████████████░░░░██████\n" +
                           "░░░░░░░░░░████░░░░██████████████░░░░████\n" +
                           "░░░░░░░░██████████████████████████████████\n" +
                           "░░░░░░░░████████████████░░████████████████\n" +
                           "░░░░░░░░░░████████████░░░░░░████████████\n" +
                           "░░░░░░██████░░░░░░░░██░░░░░░██░░░░░░░░██████\n" +
                           "░░░░░░██░░░░░░░░░░████░░░░░░████░░░░░░░░░░██\n" +
                           "░░░░░░░░██████████░░░░░░░░░░░░░░██████████");
    }
    
    public static int optionSelect(){
        int choice=0;
        Scanner input=new Scanner(System.in);
        System.out.println("what do you want to do?");
        System.out.println("1 - check inventory");
        System.out.println("2 - check health");
        System.out.println("3 - explore for new items");
        if (cans>0){
            System.out.println("4 - eat food");
        }
        if (water>0){
            System.out.println("5 - drink water");
        }
        if (logs>0){
            System.out.println("6 - stoke the fire");
        }
        if (healthPack>0){
            System.out.println("7 - heal with a healthPack");
        }
        
        
        boolean valid=false;
        while (valid==false){
            System.out.println("Pick an option by typing a number");
            choice=input.nextInt();
            if(choice>0&choice<8){              //ensures response is withing bouldaries
                if(choice<4){
                    valid=true;
                }else if(choice==4&cans>0){
                    valid=true;
                }else if(choice==5&water>0){
                    valid=true;
                }else if(choice==6&logs>0){
                    valid=true;
                }else if(choice==7&healthPack>0){
                    valid=true;
                }else{
                    System.out.println("invalid response");
                }
            }else{
                System.out.println("invalid response");
            }
        }
        return choice;
    }
    
    public static void status(){
        if(warmth==5){
            System.out.println("you start to feel a chill");
        }
        if(warmth==2){
            System.out.println("You begin to shiver");
        }
        if(warmth==0){
            System.out.println("You feel like you are about to freeze to death");
        }
        if(hunger==5){
            System.out.println("Your stomach starts to rumble");
        }
        if(hunger==2){
            System.out.println("You feel like your stomach is beginning to eat itself");
        }
        if(hunger==0){
            System.out.println("You are about to collapse from hunger");
        }
        if(thirst==5){
            System.out.println("Your mouth is parched");
        }
        if(thirst==2){
            System.out.println("Your throat is completely dry");
        }
        if(thirst==0){
            System.out.println("You feel like you are about to pass out from thirst");
        }
    }
    
    public static void checkInv(){
        System.out.println("You have:");
        System.out.println("logs: "+logs);
        System.out.println("water: "+water);
        System.out.println("cans: "+cans);
        System.out.println("Money: £"+money);
        System.out.println("healthPacks: "+healthPack);
        System.out.println("armour: "+armour);
        System.out.println("weapon: "+weapon);
        
    }
    
    public static void checkHealth(){
        System.out.println("Hunger : "+hunger+"/10");
        System.out.println("Thirst : "+thirst+"/10");
        System.out.println("Warmth : "+warmth+"/10");
        System.out.println("Health : "+health+"/100");
    }
    
    public static void explore(){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int reward = (random.nextInt(99)+1);
        System.out.println("You decided to explore the surrounding area.");
        if (reward<=10){
            progression++;
            if (progression==1){
                System.out.println("While out exploring, you notice that everyone still seems aggressive, \nbut looking around, you notice that they seem to be \ncrowding around in the middle of town.\nWhile looking around you found a water bottle, a can of food and a log.");
                logs++;
                water++;
                cans++;
            }else if (progression==2){
                System.out.println("You decide to investigate the area they seemed to gravitate towards by attempting to blend in, and you manage to find a crack in the ground, but the strange people notice you almost immediately; it's almost as if they are communicating through some method you can't make out yet. On the way back, you find a can of food, a bottle of water and a log.");
                logs++;
                water++;
                cans++;
            }else if (progression==3){
                System.out.println("As you leave the cave, you notice that there are much less people in town. You took out enough people that you can finally get to the crack that you spotted again, and it seems to be some sort of entrance. You decide to enter. It appears to be some sort of long marble hall with looming pillars flanking it's walls. As you walk further, you notice a throne.");
                picture();
                System.out.println("It's a beautiiful day outside. birds are singing, flowers are blooming...\non days like these, kids like you...\nshould be burning in hell.");
                new MP3Player(new File("MEGALOVANIA.mp3")).play();
                int result=bossFight();
                if (result==0){
                    System.out.println("You have bested Sans, and everyone seems to have gonee back to normal.");
                    victory=true;
                }
                
            }
        }else if (reward<=25){
            System.out.println("You found a log");
            logs++;
        }else if (reward<=40){
            System.out.println("You found a can of food");
            cans++;
        }else if (reward<=55){
            System.out.println("You found a bottle of water");
            water++;
        }else if (reward<=70){
            System.out.println("You found a health kit");
            healthPack++;
        }else if (reward<=80){
            int moneyReward=random.nextInt(25);
            System.out.println("You found £"+moneyReward);
            money=money+moneyReward;
        }else if (reward<=90){
            System.out.println("You ran into a man who is selling things needed for survival\nHe is selling: \n1) 1 log for £25 \n2) 1 can for £15 \n3) 1 water for £15 \n4) £50 for weapon upgrade \n5) £50 for armour upgrade \n6) to skip");
            System.out.println("You have £"+money);
            int buy = input.nextInt();
            if (buy==1&money>24){
                System.out.println("You bought a log for £25");
                logs++;
                money=money-25;
            }else if (buy==2&money>14){
                System.out.println("You bought a can for £15");
                cans++;
                money=money-15;
            }else if (buy==3&money>14){
                System.out.println("You bought a water for £15");
                water++;
                money=money-15;
            }else if (buy==4&money>49&damage<6){
                weaponUp();
                money=money-50;
            }else if (buy==5&money>49&defence<6){
                armourUp();
                money=money-50;
            }else{
                System.out.println("You bought nothing");
            }
        }else{
            battle();
        }
    }
    
    public static void weaponUp(){
        if (damage<5){
            damage++;
        }
        if (damage==2){
            weapon="sword";
        }else if (damage>1){
            weapon="sharpened sword";
        }else{
            weapon="unknown";
        }
    }
    
    public static void armourUp(){
        defence++;
        if (defence==1){
            armour="leather";
        }else if (defence==2){
            armour="Gold";
        }else if (defence==3){
            armour="Iron";
        }else if (defence==4){
            armour="Diamond";
        }else if (defence==5){
            armour="Netherite";
        }else{
            armour="unknown";
        }
    }
    
    public static void battle(){
        Random random=new Random();
        int enemyAttack=random.nextInt(4)+1;
        int enemyDrop=random.nextInt(4);
        int enemyDropAmount=random.nextInt(2)+1;
        int enemyHealth=10;
        while (enemyHealth>0&health>0){
            System.out.println("the crazed citizen strikes you and you take "+(enemyAttack-defence)+" damage.");
            health=health-(enemyAttack-defence);
            System.out.println("You strike the crazed citizen");
            enemyHealth=enemyHealth-damage;
            System.out.println("The crazed citizen has "+enemyHealth+" health left");
        }
        if (enemyHealth>0){
            System.out.println("You died");
        }else if (health>0){
            System.out.println("You killed the enemy");
            if (enemyDrop==0){
                System.out.println("You got log X"+enemyDropAmount);
                logs=logs+enemyDropAmount;
            }else if (enemyDrop==1){
                System.out.println("You got can X"+enemyDropAmount);
                cans=cans+enemyDropAmount;
            }else if (enemyDrop==2){
                System.out.println("You got water X"+enemyDropAmount);
                water=water+enemyDropAmount;
            }else if (enemyDrop==3){
                System.out.println("You got a health kit");
                healthPack++;
            }else if (enemyDrop==4){
                System.out.println("You found £"+(enemyDropAmount*10));
                money=money+enemyDropAmount*10;
            }else if (enemyDrop==5){
                System.out.println("You found a log, a bottle of water and a can of food");
                logs++;
                water++;
                cans++;
            }
        }
    }
    
    public static int bossFight(){
        
        Random random=new Random();
        int bossLife=20;
        while (health>0&bossLife>0){
            System.out.println("Sans attacks - "+(10-defence)+" damage");
            int dodge=random.nextInt(1);
            health=health-(10-defence);
            if (dodge==1){
                System.out.println("Miss");
            }else{
                System.out.println("You hit for "+damage);
                bossLife=bossLife-damage;
            }
        }
        int result=9;
        if (health<0){
            System.out.println("You lost");
            result=1;
        }else if (bossLife<0){
            System.out.println("You win");
            result=0;
        }else{
            System.out.println("error in boss fight");
        }
        
        return result;
    }
    
    public static void eat(){
        System.out.println("You eat a good meal - hunger replenished");
        hunger=10;
        cans--;
    }
    
    public static void drink(){
        System.out.println("You take a long swig from your bottle of water - thirst replenished");
        thirst=10;
        water--;
    }
    
    public static void warmth(){
        System.out.println("You stoke the fire - warmth replenished");
        warmth=10;
        logs--;
    }
    
    public static void heal(){
        System.out.println("you recover your health with a health pack");
        health=100;
        healthPack--;
    }
    
    public static void main(String[] args) {
        boolean alive=true;
        
        System.out.println("Somehow, you have managed to survive into the start of the appocolypse; \nyou were out on a stroll through the hills, havinng a great time, \nbut when you attempted to return home, you were suddenly set upon by a mob of angry citizens of the town.\nYou manage to shake them off, but as you look around, \nit seems as though a bomb was dropped but with no clear crater - \nall the windows are broken and the buildings seem to have been looted, including your house. \nYou look around and manage to find four food cans, four bottles of water, \na couple of logs for firewood and £50. You decide to take them with you, \nbut before you can search for more, you hear loud screeching from outside.\nYou decide to investigate, and find another group of wild people who force you out of town. \nYou find a cave near town and settle in, \nfinding enough firewood for a small fire at the cave's mouth.");
        logs=logs+2;
        cans=cans+4;
        water=water+4;
        money=money+50;
        
        while (alive==true&victory==false){
            
            status();
            
            boolean turnDone=false;
            
            while (turnDone==false){
                int userOption=optionSelect();
                if (userOption==1){
                    checkInv();
                }else if (userOption==2){
                    checkHealth();
                }else if (userOption==3){
                    explore();
                    turnDone=true;
                }else if (userOption==4){
                    eat();
                    turnDone=true;
                }else if (userOption==5){
                    drink();
                    turnDone=true;
                }else if (userOption==6){
                    warmth();
                    turnDone=true;
                }else if (userOption==7){
                    heal();
                    turnDone=true;
                }
            }
            alive=checkLife();
            warmth--;
            hunger--;
            thirst--;
        }
        if (victory==true){
            System.out.println("You win");
        }else{
            System.out.println("You died");
        }
    }
    
}
