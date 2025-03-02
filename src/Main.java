public class Main {
    static void faiVolare(IVolante animale) {
        animale.vola();
    };
    static void faiNuotare(INuotante animale) {
        animale.nuota();
    };
    public static void main(String[] args) throws Exception {
        AbstractAnimals doberman = new Cane();
        AbstractAnimals delfinoDellAntartide =new Delfino();
        doberman.mangia();
        doberman.verso();
        delfinoDellAntartide.dormi();
        delfinoDellAntartide.mangia();
        delfinoDellAntartide.verso();
        Aquila aquilaReale = new Aquila();
        faiVolare(aquilaReale);

    }
}
