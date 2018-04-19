import java.util.*; 
import java.io.*;
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy
{
    int atk, def, hp, mp;
    String name;
    /**
     * Creates enemy with (name given, stats based on player's stats)
     */
    public Enemy(String n,Player p)
    {
        name = n;
        Random kek = new Random();
        atk = (int)((1 + (kek.nextInt(21) - 10)*.01) * p.atk);
        def = (int)((1 + (kek.nextInt(21) - 10)*.01) * p.def);
        hp = (int)((1 + (kek.nextInt(21) - 80)*.01) * p.maxHP);
        mp = (int)((1 + (kek.nextInt(21) - 10)*.01) * p.mp);
    }
    /**
     * Hi, this is me
     */
    public String toString()
    {
        String s = ("Name: " + name );
        s +=("\nAtk: " + atk);
        s +=("\nDef: " + def + "\nHp: " + hp + "\nMp: " + mp);
        return s;
    }
    /**
     * XP value of enemy is their atk value (temp)
     * (basically idk what to put here to have nice progression)
     */
    public int worth()
    {
        return atk;
    }
    public int hit(int dmg)
    {
        return hp-= dmg;
    }
    public Item drop(Player p)
    {
        Random r = new Random();
        int type = r.nextInt(2);
        if(r.nextDouble() > .1)
        {
            int mod = r.nextInt(50+p.lv/2);
            switch(type)
            {
                case 0:
                return new MainHand(p.lv,(int)(((mod - 10)*.01) * p.atk), 0, 0, (int)(((mod - 10)*.01) * p.maxMP));
                case 1:
                return new OffHand(p.lv,(int)(((mod - 10)*.01) * p.atk), 0, 0, (int)(((mod - 10)*.01) * p.maxMP));
            }
        }
        return new Head(1,1,1,1,1);
    }
}
