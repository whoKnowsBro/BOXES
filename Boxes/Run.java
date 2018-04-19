import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Run
{
    public static final double DROP_RATE = 1;
    
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        Player bro = new Player(sc.nextLine());
        System.out.println("Hello " + bro.name + "! This is a quest");
        while(true)
        {
            System.out.println("Pick a Class!\n\nWarrior\nWizard\nWimp\nWisher\nWombat");
            String input = sc.nextLine();
            String[] lazy = {"Warrior", "Wizard", "Wimp", "Wisher", "Wombat"};
            for(int i = 0; i < lazy.length; i++)
            {
                if(input.equalsIgnoreCase(lazy[i]))
                {
                    bro.setPro(lazy[i]);
                    break;
                }
            }
            if(bro.prof.equals("N/A"))
                System.out.println("You didn't type in the correct thing! Try again!");
            else
                break;
            }
        System.out.println("\fHere is your new profile: \n");
        System.out.println(bro);
        System.out.println("\n\nPress Enter to continue");
        if(sc.nextLine().trim().equals("again"))
        {
            bro = new Player(sc.nextLine());
            System.out.println(bro);
            sc.nextLine();
        }
        while(bro.hp >= 0)
        {
            Enemy fite = new Enemy("Enemy",bro);
            System.out.println("\f" + fite);
            boolean run = false;
            while(!run && (bro.hp > 0))
            {
                System.out.println("\nWhat will you do?(enter the number)\n  1: Punch\n  2: Skill\n  3: Run\n");
                int action = sc.nextInt(); sc.nextLine();
                Skills s = new Skills();
                int hit = 0;
                switch(action)
                {
                    case 1: hit = (s.punch(bro)); fite.hit(hit); System.out.println("Nice punch - dealing " + hit +" damage"); break;
                    case 2: fite.hit(s.rSkill(bro)); break;
                    case 3: run = true;
                    default: continue;
                }
                if(fite.hp <= 0)
                {
                    bro.addXP(fite.worth());
                    Item drop = fite.drop(bro); 
                    
                    System.out.println("\fYou Win!\n\n" + bro);
                    if(r.nextDouble() < DROP_RATE)
                    {
                        System.out.println(bro.iList() + "The " + fite.name + " dropped a(n)" + drop + "\nDo you want to equip it? (enter yes or no) (if not it goes away forever)");
                        if(sc.nextLine().trim().equalsIgnoreCase("yes"))
                        {
                            bro.equip(drop);
                            System.out.println("\fHere are your new stats\n" + bro+"\nEnter to continue");
                        }
                    }
                    break;
                }
                if(bro.hp <= 0)
                    break;
                int a = s.punch(fite);
                System.out.println("\nThe "+ fite.name + " attacks - dealing " + a + " damage.");
                bro.addHp(-a);
                System.out.println("You have " + bro.hp + " hp & " + bro.mp + " mp\nThe enemy has " + fite.hp + " hp");
                
            }   
        }
        System.out.println("gg no re");

    }
}
