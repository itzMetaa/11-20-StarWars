/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg20.starwars;

/**
 *
 * @author Diak
 */
public abstract class AnakinSkywalker extends Jedi implements Sith{

    public AnakinSkywalker(double ero, boolean atallhatE) {
        super(150, true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        if(AnakinSkywalker.mekkoraAzEreje > 1000){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean engeddElAHaragod() {
        if(engeddElAHaragod){
            super.ero += RandomDouble*10;
        }
    }
    
    
}
