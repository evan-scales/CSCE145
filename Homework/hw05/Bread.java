/**
 * written by Evan Scales
 */
public class Bread {
    private String name;
    private int calories;
    private String type;

    public Bread(){
        this.name = "none";
        this.calories = 0;
        this.type = "none";
    }

    public Bread(String aN, int aC, String aT){
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
            this.name = "Wonder Bread";
    }
    public void setCalories(int aC){
        if(aC >= 50 && aC <= 250)
            this.calories = aC;
        else
            this.calories = 0;
    }
    public void setType(String aT){
        if(aT != null && (aT.equalsIgnoreCase("Honey Wheat") || aT.equalsIgnoreCase("White") ||
             aT.equalsIgnoreCase("Whole Grain") || aT.equalsIgnoreCase("Whole Wheat")))
             this.type = aT;
        else
            this.type = "none";
    }
    public String toString(){
        return "Bread\nName: "+name+"\n"+"Type: "+type+"\n"+"Calories: "+calories;
        
    }
    
    public boolean equals(Bread anB){
        return anB != null &&
            this.name.equalsIgnoreCase(anB.getName()) &&
            this.calories == anB.getCalories() &&
            this.type.equalsIgnoreCase(anB.getType());
    }
}