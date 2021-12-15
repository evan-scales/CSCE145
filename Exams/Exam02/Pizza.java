 /**
 * Written by Evan Scales
 */
public class Pizza {
    private String location;
    private int numberOfToppings;
    private double price;

    public Pizza(){
        location = "none";
        numberOfToppings = 0;
        price = 0.0;
    }

    public Pizza(String aL, int aN, double aP){
        this.location = aL;
        this.numberOfToppings = aN;
        this.price = aP;
    }

    public String getLocation(){
        return this.location;
    }
    public int getNumberOfToppings(){
        return this.numberOfToppings;
    }
    public double getPrice(){
        return this.price;
    }

    public void setLocation(String aL){
        if(aL != null)
            this.location = aL;
        else   
            this.location = "none";
    }
    public void setNumberOfToppings(int aN){
        if(aN >= 1)
            this.numberOfToppings = aN;
        else    
            this.numberOfToppings = 0;
    }
    public void setPrice(double aP){
        if(aP > 0.0)
            this.price = aP;
        else    
            this.price = 0.0;
    }

    public String toString(){
        return "Location: "+location+" Number of Toppings: "+numberOfToppings+" Price: "+price;
    }
    public boolean equals(Pizza anP){
        return anP != null &&
            this.location.equalsIgnoreCase(anP.getLocation()) &&
            this.numberOfToppings == anP.getNumberOfToppings() &&
            this.price == anP.getPrice(); 
    }
    public double costPerSlice(int pS){
        if(pS > 0)
            return this.price / pS;
        else
            return 0.0;
    }
    public static Pizza leastExpensive(Pizza anP, Pizza anP2){
        if(anP == null && anP2 == null)
            return null;
        else if (anP == null)
            return anP2;
        else if(anP2 == null)
            return anP;
        else if(anP.getPrice()<anP2.getPrice())
            return anP;
        else if(anP.getPrice()>anP2.getPrice())
            return anP2;
        else 
            return anP;
    }
    
}
//SOLUTION DESCRIPTION
/**
 *To fix the problem the first thing to do is to make a Pizza class. It has 3 private variables called location, 
 number of toppings, and price. Then the default constructor is made, same with the parameterized constructor. Then 
 there are 3 methods that return the variable if that method is called. Then next is the mutators and for the setLocation
  method it first checks if the variable is null. If it is not null then the location changes to whatever the the user wanted. 
  If it is null then it is set to “none.” For setNumberOfToppings it first checks if it is greater than or equal to 1. If 
  that is true then it is set to whatever the user wants, if not then it is set to 0. For setPrice it checks if it is greater
   than 0 if it is then it is set to whatever the user wanted, if not then it is set to 0. The toString method returns all
    the variables with what it is next to it. The equals method first checks if the other pizza variable is null, then checks
     the location, price, and number of toppings. If they all match then it returns true. To find the cost per slice the method
      takes in a number that represents the number of slices in the pizza, and if that number is greater than 0 then it divides the
       price by the number of slices and returns that number. The last method checks which pizza is cheaper. If both pizzas are null
        it returns null, if one is null it returns the other pizza, if neither are null it returns the cheaper pizza. 
 */
