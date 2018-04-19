
/**
 * Write a description of class MainHand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OffHand extends Item
{
    public OffHand(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Off Hand " + super.toString();
    }
}
