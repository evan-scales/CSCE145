/**
 * written by Evan Scales
 */
public class PBJSandwich {
    Bread topSlice;
    PeanutButter peanutButter;
    Jelly jelly;
    Bread bottomSlice;

    public PBJSandwich(){
        topSlice = new Bread();
        this.peanutButter = new PeanutButter();
        this.jelly = new Jelly();
        bottomSlice = new Bread();
    }

    public Bread getTop(){
        return topSlice;
    }
    public Bread getBottom(){
        return bottomSlice;
    }
    public PeanutButter getButter(){
        return peanutButter;
    }
    public Jelly getJelly(){
        return jelly;
    }

    public void setBottom(String aN, String aT, int aC){
        bottomSlice.setType(aT);
        bottomSlice.setCalories(aC);
        bottomSlice.setName(aN);
    }
    public void setTop(String aN, String aT, int aC){
        topSlice.setName(aN);
        topSlice.setType(aT);
        topSlice.setCalories(aC);
    }
    public void setButter(String aN, boolean aI, int aC){
        this.peanutButter.setName(aN);
        this.peanutButter.setIsCrunchy(aI);
        this.peanutButter.setCalories(aC);
    }
    public void setJelly(String aN, String aT, int aC){
        this.jelly.setName(aN);
        this.jelly.setType(aT);
        this.jelly.setCalories(aC);
    }

    public String toString(){
        return "PBJ Sandwich\n Top Slice:\n"+topSlice.toString()+"\nPeanut Butter:\n"+peanutButter.toString()+"\nJelly:\n"+jelly.toString()+"/nBottom Slice:\n"+bottomSlice.toString();
    }
    public boolean equals(PBJSandwich anPBJ){
        return anPBJ != null &&
            this.jelly.equals(anPBJ.getJelly()) &&
            this.peanutButter.equals(anPBJ.getButter()) &&
            topSlice.equals(anPBJ.getTop()) &&
            bottomSlice.equals(anPBJ.getBottom());

    }



    
}