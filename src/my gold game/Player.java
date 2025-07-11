public class Player {
    private int money;
    private int diggerUses;

    public Player (int money, int diggerUses){
        this.money = money;
        this.diggerUses = diggerUses;
    }

    public boolean canDig()
    {
        if (diggerUses <= 0)
        {
            return false;
        }
        return true;
    }

    public void useDiggers()
    {
        if (diggerUses > 0)
        diggerUses --;
    }

    public void buyNewDigger() throws InvlidAmountException
    {
        if (money >= 100)
        {
            money -= 100;
            diggerUses = 10;
        }
        else
        {
            throw new InvlidAmountException("Don't have enough momey! Digger $100");
        }
        
    }

    public int getMoney()
    {
        return money;
    }
    public void addMoney(int amount)
    {
        money += amount;
    }
}
