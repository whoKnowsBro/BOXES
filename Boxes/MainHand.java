
/**
 * Write a description of class MainHand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainHand extends Item
{
    public MainHand(int l, int a, int d, int h, int m)
    {
        super(l, a, d, h, m);
    }
    public String toString()
    {
        return "Main Hand " + super.toString();
    }
}
