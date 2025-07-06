import java.util.Random;

public class Gold {
    private String size;
    private int value;

    public Gold(String size, int value)
    {
        this.size = size;
        this.value = value;
    }
    public String getSize()
    {
        return size;
    }
    
    public int getValue()
    {
        return value;
    }
    public static Gold generateGold()
    {
        Random generator = new Random();
        int chance = generator.nextInt(100);

        if (chance < 70)
        {
            return new Gold("small", 10);
        }
        else 
        {
            return new Gold("small", 15);
        }
    }
}
