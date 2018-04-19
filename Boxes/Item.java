
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Item
{
    int level;
    int atk, def, hp, mp;
    public Item(int l, int a, int d, int h, int m)
    {
        level = l; atk = a; def = d; hp = h; mp = m;
    }
    public String toString()
    {
        return ("Level: " +level+", Attack: "+atk+", Defence: " + def + ", Health: " + hp + ", Mana: " + mp);
    }
}
