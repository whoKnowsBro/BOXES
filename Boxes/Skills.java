import java.util.*; 
import java.io.*;
/**
 * Write a description of class Skills here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skills
{
    private static Random kek = new Random(); // Y Not?
    /**
     * * Ye olde Smack
     * * Wishers always have a chance for very bad hits
     */
    public static int punch(Player p)
    {
        int prof = -1;
        
        if(p.prof.equals("Warrior"))
            prof = 0;
        if(p.prof.equals("Wizard"))
            prof = 1;
        if(p.prof.equals("Wimp"))
            prof = 2;
        if(p.prof.equals("Wisher"))
            prof = 3;
        if(p.prof.equals("Wombat"))
            prof = 4;
        switch(prof)
        { 
            case 0: return (int)((1 + (kek.nextInt(21) - 5)*.01) * p.atk);
            case 1: return (int)((1 + (kek.nextInt(21) - 15)*.01) * p.atk);
            case 2: return (int)((1 + (kek.nextInt(21) - 30)*.01) * p.atk);
            case 3: return (int)((1 + (kek.nextInt(200) - 100)*.01) * p.atk);
            case 4: return (int)((1 + (kek.nextInt(21) - 10)*.01) * p.atk);
        }
        return p.atk;
    }
    /**
     * * Ye olde Smack from the enemy
     */
    public static int punch(Enemy p)
    {
        return (int)((1 + (kek.nextInt(31) - 15)*.01) * p.atk);
    }
    /**
     * * Warrior = 75% to hit higher than atk
     * * Wizard = 50% damage varience
     * * Wimp = more damage based on missing hp
     * * Wisher = 50/50 deal damage or heal up to 6xAtk 
     * * Wombat = 35% damage varience
     */
    public static int rSkill(Player p)
    {
        if(p.mp <=0)
        {
            System.out.println("No mp! nothing happens");
            return 0;
        }
        p.addMp(-10);
        int prof = -1;
        if(p.prof.equals("Warrior"))
            prof = 0;
        if(p.prof.equals("Wizard"))
            prof = 1;
        if(p.prof.equals("Wimp"))
            prof = 2;
        if(p.prof.equals("Wisher"))
            prof = 3;
        if(p.prof.equals("Wombat"))
            prof = 4;
            int dmg = p.atk;
        switch(prof)
        {
            
            case 0: //Warrior = 75% to hit higher than atk
            {
                dmg = (int)((1 + (kek.nextInt(41) - 10)*.01) * p.atk);
                System.out.println("Warrior Wack! - deals " + dmg + " damage!");
                
                return dmg;
            }
            case 1: //Wizard = 50% damage varience
            {
                dmg = (int)((1 + (kek.nextInt(101) - 50)*.01) * p.atk);
                System.out.println("Wizard Wave! - deals " + dmg + " damage!");
                
                return dmg;
            }
            case 2: //Wimp does more based on missing hp
            {
                dmg = (int)((1 + (kek.nextInt(16))*.01) * (p.maxHP - p.hp)); 
                System.out.println("Wimpy Wobble! - deals " + dmg + " damage!");
                
                return dmg;
            }
            case 3: //Wisher = 50/50 deal damage or heal up to 6xAtk 
            {
                dmg = (int)((1 + (kek.nextInt(1001) - 500)*.01) * p.atk);
                System.out.println("Wisher's Wish! - deals " + dmg + " damage!");
                
                return dmg;
            }
            case 4: //Wombat = 35% damage varience
            {
                dmg = (int)((1 + (kek.nextInt(71) - 35)*.01) * p.atk);
                System.out.println("Wombat Wiggle! - deals " + dmg + " damage!");
                
                return dmg;
            }
        }
        System.out.println("No Class No Clue"); //IDK how
        return p.atk;
    }
}
