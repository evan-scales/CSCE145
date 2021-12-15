/**
 * written by Evan Scales
 */
public class PeanutButter {
    private String name;
    private int calories;
    private boolean isCrunchy;

    public PeanutButter(){
        this.name = "none";
        this.calories = 0;
        this.isCrunchy = false;
    }

    public PeanutButter(String aN, int aC, boolean aI){
        this.setCalories(aC);
        this.setName(aN);
        this.setIsCrunchy(aI);
    }

    public String getName(){
        return this.name;
    }
    public int getCalories(){
        return this.calories;
    }
    public boolean getIsCrunchy(){
        return this.isCrunchy;
    }

    public void setName(String aN){
        if(aN != null)
            this.name = aN;
        else   
            this.name = "none";
    }
    public void setCalories(int aC){
        if(aC >= 100 && aC <= 300)
            this.calories = aC;
        else
            this.calories = 0;
    }
    public void setIsCrunchy(Boolean aI){
        if(aI != null)
             this.isCrunchy = aI;
        else
            this.isCrunchy = false;
    }
    public String toString(){
        return "Peanut Butter\nName: "+name+"\n"+"IsCrunchy: "+isCrunchy+"\n"+"Calories: "+calories;
    }
    
    public boolean equals(PeanutButter anPB){
        return anPB != null &&
            this.name.equalsIgnoreCase(anPB.getName()) &&
            this.calories == anPB.getCalories() &&
            this.isCrunchy == (anPB.getIsCrunchy());

    }
    
}