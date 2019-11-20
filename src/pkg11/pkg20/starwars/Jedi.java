
package pkg11.pkg20.starwars;


public abstract class Jedi implements EroErzekeny{
    private double ero;
    private boolean atallhatE;

    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }
    
    public abstract boolean megteremtiAzEgyensulyt();

    @Override
    public boolean legyoziE(EroErzekeny ellenfel) {
        if (ellenfel.getClass() == Jedi.class){
            if (ellenfel.isAtallhatE == true && ellenfel.mekkoraAzEreje() < this.ero) {
                return true;
            } else {
                return false;
            }
        } else if(ellenfel.getClass() == Uralkodo.class){
        
        } else {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.ero;
    }

    public double getEro() {
        return ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    @Override
    public String toString() {
        return "Jedi{" + "ero=" + ero + ", atallhatE=" + atallhatE + '}';
    }
    
    

    
    
    
}
