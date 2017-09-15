/**
 * Created by jc299702 on 15/09/17.
 */
public class PetSold
{
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public void setIsVaccinated(boolean isVac)
    {
        isVaccinated = isVac;
    }

    public void setIsNeutered(boolean isNeut)
    {
        isNeutered = isNeut;
    }

    public void setIsHousebroken(boolean isHb)
    {
        isHousebroken = isHb;
    }

    public boolean getIsVaccinated()
    {
        return isVaccinated;
    }

    public boolean getIsNeutered()
    {
        return isNeutered;
    }

    public boolean getIsHousebroken()
    {
        return isHousebroken;
    }
}
