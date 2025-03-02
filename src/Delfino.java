public class Delfino extends AbstractAnimals implements INuotante{

    @Override
    void verso() {
       System.out.println("priii prii");
    }

    @Override
    void mangia() {
        System.out.println("Mangia pesciolini");
    }

    @Override
    public void nuota() {
        System.out.println("Nuota a 25km/h");
    }

}
