
/**
 * Write a description of class Feet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Feet extends Item
{
    public Feet(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Boots " + super.toString();
    }
}
