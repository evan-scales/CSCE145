/**
 * written by Evan Scales
 */
public class DigitalPiano extends Piano{
    private int numberOfVoices;

    public DigitalPiano(){
        numberOfVoices = 1;
    }

    public DigitalPiano(int aK, int aV){
        super(aK);
        this.numberOfVoices = aV;
    }

    public int getNumberOfVoices(){
        return numberOfVoices;
    }
    public void setNumberOfVoice(int aV){
        if(aV >= 1)
            this.numberOfVoices = aV;
        else
            this.numberOfVoices = 1;
    }

    public boolean equals(DigitalPiano aP){
        return aP != null &&
          super.equals(aP) &&
            this.numberOfVoices == aP.getNumberOfVoices();     
    }   
}
//SOLUTION DESCRIPTION
/**
 * In the digital piano class it extends from the piano class. Then a variable called
 *  numberOfVoices is created. Then the default constructor is created and numberOfVoices is set to 1. 
 * In the parameterized constructor it takes 2 parameters but there is only 1 variable in the digital piano class.
 *  In the constructor the method called super is used to be able to have the number of keys. Then a method called 
 * getNumberOfVoices is made that returns the variable numberOfVoices. Then to set the number of voices it checks if
 *  the number is greater than or equal to 0, if it is then it is set to whatever the user wants. If the number is less 
 * than 1 then it is set back to 1. Finally in the equals method it checks if the other piano is not null, checks the to see 
 * if the number of voices are the same. To check if the number of keys is equal super is used which will use the equals method in
 *  the piano class to check if the number of keys is equal. If everything is true then it returns true. 
 * 
 */