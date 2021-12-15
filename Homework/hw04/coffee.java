/**
 * written by Evan Scales
 */
public class coffee {

    private String name;
    private int caffeineContent;

    public coffee(){
        this.name = "Waffle House Coffee";
        this.caffeineContent = 100;
    }

    public coffee(String aN, int aC){
        this.setName(aN);
        this.setCaffeineContent(aC);
    }

    public String getName(){
        return this.name;
    }
    public int getCaffeineContent(){
        return this.caffeineContent;
    }

    public void setName(String aN){
        if(aN != null){
            this.name = aN;
        }
        else{
            this.name = "Waffle House Coffee";
        }
    }
    public void setCaffeineContent(int aC){
        if(aC >= 50 && aC <= 300){
            this.caffeineContent = aC;
        }
        else{
            this.caffeineContent = 100;
        }
    }
    public double riskyAmount(int cC){
        return 180.0/((cC/100.0)*6.0);
    }
    public String toString(){
        return "it would take "+riskyAmount(caffeineContent)+" "+name+" coffees before it's dangerous to drink more";
    }  
}