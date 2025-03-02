public class Aquila extends AbstractAnimals implements IVolante {

    @Override
    void verso() {
        System.out.println("iah iah");
    }

    @Override
    void mangia() {
        System.out.println("Mangia pesce");
    }

    @Override
    public void vola() {
        System.out.println("Vola molto in alto");
    }

}
