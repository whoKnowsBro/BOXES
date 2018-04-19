import java.util.*;
import java.io.*;

class boxes
{
    static int atk, def, hp, mp, xp = 0, lv = 1, xpLv = 15;
    static String name, slogan, prof = "na";
    public static void start()
    {
        box.potato();
    }

    public static void win(int lv, int hp)
    {
        xp = lv * hp / 10;
        System.out.println("You got " + xp + " xp!");
        if(boxes.xp > xpLv)
        {
            System.out.println("You leveled up!");
            lv++;
            xp = 0;
            xpLv = (xpLv * 3 / 10) + xpLv;
            hp += 10; mp += 10; atk += 3; def += 3;
        }
    }

    public static void statGen()
    {
        Random kek = new Random();
        atk = kek.nextInt(9) + 1;
        def = kek.nextInt(9) + 1;
        hp = kek.nextInt(9) * 10 + 30;
        mp = kek.nextInt(9) * 10 + 30;
    }
}
class box
{
    public static void potato()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        boxes.name = sc.nextLine();
        boxes.slogan = "I am a n00b";
        System.out.println("Hello " + boxes.name + "! This is a quest");
        boxes.statGen();
        sc.nextLine();
        System.out.println("\fHere is your new profile: \n");
        System.out.println("Name: " + boxes.name + "\nClass: nothing \nSlogan: " + boxes.slogan);
        System.out.println("Level: " + boxes.lv + "\nXP: " + boxes.xp + "\nAtk: " + boxes.atk);
        System.out.println("Def: " + boxes.def + "\nHp: " + boxes.hp + "\nMp: " + boxes.mp);
        sc.nextLine();
        System.out.println("\fNow that you are officially a n00b, what class will you be?");
        while(true)
        {
            System.out.println("\nWarrior\nWizard\nWimp\nWisher\nWombat");
            String input = sc.nextLine();
            String[] lazy = {"Warrior", "Wizard", "Wimp", "Wisher", "Wombat"};
            for(int i = 0; i < lazy.length; i++)
            {
                if(input.equals(lazy[i]))
                {
                    boxes.prof = lazy[i];
                    break;
                }
            }
            if(boxes.prof.equals("na"))
                System.out.println("You didn't type in the correct thing! Try again!");
            else
                break;
        }
        
        
    }
}
class skills
{
    static int prof = -1;
    static boolean checked = false;
    public static void mushroom(){
        if(!checked)
        {
            if(boxes.prof.equals("Warrior"))
                prof = 0;
            if(boxes.prof.equals("Wizard"))
                prof = 1;
            if(boxes.prof.equals("Wimp"))
                prof = 2;
            if(boxes.prof.equals("Wisher"))
                prof = 3;
            if(boxes.prof.equals("Wombat"))
                prof = 4;
            checked = true;
        }
        switch(prof)
        {

        }
    }
}

