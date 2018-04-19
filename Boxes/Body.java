
/**
 * Write a description of class Chest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Body extends Item
{
    public Body(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Chest " + super.toString();
    }
}
