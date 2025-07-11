import java.util.Scanner;

public class Game {
    private Player player;
    private Digger digger;
    private Scanner scanner;

    public Game()
    {
        player = new Player(20, 10);
        digger = new Digger();
        scanner = new Scanner(System.in);
    }

    public void StartGame() throws InvlidAmountException
    {
        System.out.println("Welcome to Gold Digging \n \n");
        boolean play = true;

        while (play)
        {
            System.out.println("Do you want to play (y/n). Balance: " + player.getMoney());
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y"))
            {
                if (player.canDig())
                {
                    digger.getDigger();
                    Gold gold = digger.dig();
                    System.out.println("\n You find a " + gold.getSize() + ", it worth " + gold.getValue() + "\n");
                    player.addMoney(gold.getValue());
                    player.useDiggers();
                }
                else 
                {
                    System.out.println("opts! your digger is broken, want to but a new one? (y/n)");
                    String input2 = scanner.nextLine().toLowerCase();
                    if (input2.equals("y"))
                    {
                        player.buyNewDigger();
                        System.out.println("New digger brought!");
                    }
                    else
                    {
                        System.out.println("you don't have a digger. Thank you for playing. Game teriminate ");
                        play = false;
                    }
                    
                }
            }
            else
            {
                if (player.getMoney() < 100)
                {
                    System.out.println("You don't have enough money. Game terminate!");
                    play = false;
                }
                else
                {
                    System.out.println("Thank you for playing! you account balance is " + player.getMoney());
                    play = false;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.StartGame();
    }
}
