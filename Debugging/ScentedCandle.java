/**
 * Created by jc299702 on 15/09/17.
 */
public class ScentedCandle
{
    private String scent;
    public String getScent()
    {
        return scent;
    }

    public void setScent(String scent)
    {
        this.scent = scent;
    }

    public void setHeight(int h)
    {
        final double PER_INCH = 3;
        super.setHeight(h);
        price = h * PER_INCH;
    }
}
