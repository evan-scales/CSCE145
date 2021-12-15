/**
 * written by Evan Scales
 */
public class Jelly {
    private String name;
    private int calories;
    private String type;

    public Jelly(){
        this.name = "none";
        this.calories = 0;
        this.type = "none";
    }

    public Jelly(String aN, int aC, String aT){
        this.setCalories(aC);
        this.setName(aN);
        this.setType(aT);
    }

    public String getName(){
        return this.name;
    }
    public int getCalories(){
        return this.calories;
    }
    public String getType(){
        return this.type;
    }

    public void setName(String aN){
        if(aN != null)
            this.name = aN;
        else   
            this.name = "Smuckers";
    }
    public void setCalories(int aC){
        if(aC >= 50 && aC <= 200)
            this.calories = aC;
        else
            this.calories = 0;
    }
    public void setType(String aT){
        if(aT != null && (aT.equalsIgnoreCase("Apple") || aT.equalsIgnoreCase("Blueberry") ||
             aT.equalsIgnoreCase("Grape") || aT.equalsIgnoreCase("Strawberry") || aT.equalsIgnoreCase("Tomato")))
             this.type = aT;
        else
            this.type = "none";
    }
    public String toString(){
        return "Jelly\nName: "+name+"\n"+"Fruit Type: "+type+"\n"+"Calories: "+calories;
    }
    
    public boolean equals(Jelly anJ){
        return anJ != null &&
            this.name.equalsIgnoreCase(anJ.getName()) &&
            this.calories == anJ.getCalories() &&
            this.type.equalsIgnoreCase(anJ.getType());
    }
    
}