import java.util.*; 
import java.io.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    int atk, def, hp, mp, xp = 0, lv = 1, xpLv = 15, maxHP, maxMP;
    String name, slogan = "I am a n00b", prof = "N/A";
    Random kek = new Random();
    Item[] equipment = new Item[6];
    public Player(String n)
    {
        name = n;
        
        atk = kek.nextInt(9) + 1;
        def = kek.nextInt(9) + 1;
        maxHP = hp = kek.nextInt(9) * 10 + 30;
        maxMP = mp = kek.nextInt(9) * 10 + 30;
    }
    public void addAtk(int add)
    {
        atk += add;
    }
    public void addDef(int add)
    {
        def += add;
    }
    public void addHp(int add)
    {
        hp += add;
    }
    public void addMp(int add)
    {
        mp += add;
    }
    public void setPro(String s)
    {
        prof = s;
    }
    /**
     * You have done something
     */
    public void addXP(int add)
    {
        xp += add;
        while(xp > xpLv) // checks if levelup
            levelup();
    }
    /**
     * increments stats at levelup (and refills hp)
     */
    public void levelup()
    {
        int addition;
        addition = (xp>=xpLv) ? 1: 0;
        lv += addition;
        int sub = (addition == 1) ? xpLv : 0;
        xp -= sub;
        int in = (addition == 1) ? (int)(xpLv*1.3) : xpLv;
        xpLv = in;
        if(addition == 1)
        {
            maxHP += kek.nextInt(10) + 11; maxMP += kek.nextInt(10) + 11; atk += kek.nextInt(5) + 1; def += kek.nextInt(5) + 1;
            hp = maxHP; mp = maxMP;
        }
    }

    public void equip(Item i)
    {
        if(i instanceof MainHand)
        {
            if(equipment[0] != null)
                weaken(equipment[0]);
            equipment[0] = i; boost(i);
        }
        if(i instanceof OffHand)
        {
            if(equipment[1] != null)
                weaken(equipment[1]);
            equipment[1] = i; boost(i);
        }
        if(i instanceof Head)
        {
            if(equipment[2] != null)
                weaken(equipment[2]);
            equipment[2] = i; boost(i);
        }
        if(i instanceof Body)
        {
            if(equipment[3] != null)
                weaken(equipment[3]);
            equipment[3] = i; boost(i);
        }
        if(i instanceof Legs)
        {
            if(equipment[4] != null)
                weaken(equipment[4]);
            equipment[4] = i; boost(i);
        }
        if(i instanceof Feet)
        {
            if(equipment[5] != null)
                weaken(equipment[5]);
            equipment[5] = i; boost(i);
        }
    }
    private void boost(Item i)
    {
        atk += i.atk; def += i.def; maxHP += i.hp; maxMP += i.mp;
    }
    private void weaken(Item i)
    {
        atk -= i.atk; def -= i.def; maxHP -= i.hp; maxMP -= i.mp;
    }
    public String iList()
    {
        String iL = "Equipment:\n";
        for(int a = 0; a < equipment.length; a++)
            iL+= equipment[a] + "\n";
        iL+="\n";
        return iL;
    }
        /**
     * Now you see me
     */
    public String toString()
    {
        String s = ("Name: " + name + "\nClass: " + prof + "\nSlogan: " + slogan + "\nLevel: " + lv + "\nXP: " + xp + "\nAtk: " + atk + "\nDef: " + def + "\nHp: " + hp + "\nMp: " + mp);
        return s;
    }
}
