class Game
{
    private double price;
    private boolean isAvailable;
    private String title;
    //private int itemCode;
    //private int dateOfPurchase;
    public Game(double thePrice, boolean theIsAv, String theTitle)
    {
        price = thePrice;
        isAvailable = theIsAv;
        title = theTitle;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double thePrice)
    {
        price = thePrice;
    }
    public boolean getIsAv()
    {
        return isAvailable;
    }
     public void setIsAv(boolean theIsAv)
    {
        isAvailable = theIsAv;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String theTitle)
    {
        title = theTitle;
    }
    public String toString()
    {
        return "The game title =" + title + ", price = " + price;
    }
}