public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial nave) {
        this.naveDecorada = nave;
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }
}
