package Task5_DIP.Model;

import Task5_DIP.Controller.iEngineStart;

public class PetrolEngine implements iEngineStart {
    public void start() {
        System.out.println("Двигатель запущен ! ПАРАМ ПАМ ПАМ !");
    } 
}
