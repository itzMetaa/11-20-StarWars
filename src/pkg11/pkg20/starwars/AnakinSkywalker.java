
package pkg11.pkg20.starwars;

import java.util.Random;

public abstract class AnakinSkywalker extends Jedi implements Sith{

    Random r = new Random();
    
    public AnakinSkywalker() {
        super(150, true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        if(mekkoraAzEreje() > 1000){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void engeddElAHaragod() {
            super.ero += r.nextDouble()*10;
    }
    
    
}
