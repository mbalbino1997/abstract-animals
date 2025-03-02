public class Passerotto extends AbstractAnimals implements IVolante {

    @Override
    void verso() {
        System.out.println("Cip cip");
    }

    @Override
    void mangia() {
        System.out.println("Mangia semi di girasole");
    }

    @Override
    public void vola() {
        System.out.println("Vola vicino le casette");
    }

}
