5) Переписать код в соответствии с Dependency Inversion Principle:
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

public class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }

}

public class PetrolEngine {

    public void start() {
    }
}
