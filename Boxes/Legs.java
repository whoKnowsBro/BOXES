
/**
 * Write a description of class Leg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Legs extends Item
{
    public Legs(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Pants " + super.toString();
    }
}
