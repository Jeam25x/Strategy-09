package EjercicioStrategy.clases.clasesDeQuack;

import EjercicioStrategy.clases.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}
