public class App {
    public static void main(String[] args) throws Exception {
        AbstractAnimals doberman = new Cane();
        AbstractAnimals delfinoDellAntartide =new Delfino();
        doberman.mangia();
        doberman.verso();
        delfinoDellAntartide.dormi();
        delfinoDellAntartide.mangia();
        delfinoDellAntartide.verso();

    }
}
