
/**
 * Write a description of class Head here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Head extends Item
{
    public Head(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Helmet " + super.toString();
    }
}
