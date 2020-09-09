import java.util.*;
class PlayzStore
{
    private Customer customers[] = new Customer[5];
    private Game games [] = new Game[10];

    private double discounts[] = new double[7];

    private final String STORE_NAME = "MIN'S GAME STORE";
    //constructor. (arguments needed, refer to each class attributes)
    public PlayzStore()
    {
        /*customerOne = new Customer("Jim", 200, "jimijones@minsgame.org" );
        gameOne = new Game(30, true, "Nintendo Mario Cart");
        gameTwo = new Game(25, false, "Live or Die");

        System.out.println("Welcome to " + STORE_NAME);
        customerOne.purchase(gameOne);*/
        
        setupDiscounts();
        setupCustomers();
        setupGames();
        openStore();
        // 
    }//

    private void setupDiscounts()
    {
        for(int i = 0; i <discounts.length; i++)
        {
            discounts[i] = 10 + (10*i);
        }
    }

    private void setupCustomers()
    {
        customers[0] = new Customer("Josh", 300, "josh123@gmail.com");
        customers[1] = new Customer("Sarah", 450, "sarahiscool@gmail.com");
        customers[2] = new Customer("Mina", 600, "iammina@mail.student.edu");
        customers[3] = new Customer("Kayla", 30000, "richk@gmail.com");
        customers[4] = new Customer("Daniel", 800, "danieloh@student.edu");
    }

    private void setupGames()
    {
        games[0] = new Game(50, true, "Zelda");
        games[1] = new Game(50, true, "Pokemon");
        games[2] = new Game(400, true, "Nintendo Switch");
        games[3] = new Game(50, false, "Zarahs");
        games[4] = new Game(55, true, "game5");
        games[5] = new Game(70, false, "game6");
        games[6] = new Game(20, true, "game7");
        games[7] = new Game(35, false, "game8");
        games[8] = new Game(75, true, "game9");
        games[9] = new Game(60, false, "game10");
    }

    public int getGameNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the game number 0~9 :");
         int number = in.nextInt();
         return number;
    }

    public void openStore()
    {
        System.out.println("MIN'S GAME STORE is open for business");
        for (int i = 0; i <games.length; i++)
        {
            System.out.println(i + ":" + games[i].getTitle());
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your customer name");
        String cusName = in.next();
        Customer foundCustomer = findCustomer(cusName);
        if(foundCustomer!=null)
        {
            System.out.println("Please enter the Game title: ");
            String gameTtl = in.next();
            Game foundGame = findGame(gameTtl);
            if(foundGame!=null && foundGame.getIsAv()==true)
            {
                foundCustomer.purchase(foundGame);
            }
            else
            {
                System.out.println("Game not found");
               
            }
            
        }
        
        /* int num = getGameNumber();
            if(num>=0 && num<10)
            { 
                System.out.println("processing...");
                Scanner in = new Scanner(System.in);
                System.out.println("Insert your id number");
                int cusNum = in.nextInt();
                /*if (cusNum >=0 && cusNum <5)
                {
                    customers[cusNum].purchase(games[num]);
                }
                else
                {
                    System.out.println("Invalid customer number");
                    
                }
            }
            else
        {
            System.out.println("Invalid number, type again");
            getGameNumber();
        }*/
    }
    public Customer findCustomer(String name)
    {
        //boolean found = false;
        Customer foundCustomer = null;
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i].getName().equalsIgnoreCase(name))
            {
                //found = true;
                System.out.println("Customer has been found :" + customers[i].getName());
                foundCustomer = customers[i];
                
                return foundCustomer;
            }
            
        }
 
        
            return foundCustomer;
    }
    public Game findGame(String name)
    {
        Game foundGame = null;
        //boolean found = false;
        for(int i = 0; i<games.length; i++)
        {
            if(games[i].getTitle().equalsIgnoreCase(name))
            {
                //found = true;
                foundGame = games[i];
                return foundGame;
            }
        }
        
        return foundGame;
    }
    
}