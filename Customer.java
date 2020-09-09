import java.util.*;
class Customer
{
    private String name;
    private double credit;
    private String email;
    private Game myGame;
    
    public Customer(String theName, double theCredit, String theEmail)
    {
        name = theName;
        credit = theCredit;
        email = theEmail;
        
    }
    public String getName()
    {
        return name;
    }
    public void setName(String theName)
    {
        name = theName;
    }
    public double getCredit()
    {
        return credit;
    }
    public void setCredit(double theCredit)
    {
        credit = theCredit;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String theEmail)
    {
        email = theEmail;
    }
    public void purchase (Game theGame)
    {
        //check if customer has enough money
        double price = theGame.getPrice();
        if (credit >= price)
        {
        boolean isAv = theGame.getIsAv();
            if ( isAv == true)
            {
                theGame.setIsAv(false);
                credit = credit - price;
                myGame = theGame;
                System.out.println("Purchase successful :" + myGame.toString());
                System.out.println("Remaining balance : " +getCredit());
            }
            else 
            {
                System.out.println("Purchase unseccessful; game title unavailable");
            }
        }
        else 
        {
            System.out.println("Purchase unavailable; not enough credit");
            
        }
        
    }
    
    public void addCredit()
    {
        System.out.println("How much credit would you like to add?");
        Scanner in = new Scanner(System.in);
        double newCredit = in.nextDouble();
        credit = credit + newCredit; 
        System.out.println("Credit = " + credit);
    }
}