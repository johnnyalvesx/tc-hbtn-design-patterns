public class Director {

    void buildGuerreiro(Builder biulder) {
        biulder.setNome("Guerreiro");
        biulder.setTipo(TipoPersonagem.GUERREIRO);
        biulder.setInteligencia(1);
        biulder.setForca(8);
        biulder.setDestreza(6);
        biulder.setVigor(5);
        biulder.setResistencia(10);
    }

    void buildLadrao(Builder builder) {
        builder.setNome("Ladrao");
        builder.setTipo(TipoPersonagem.LADRAO);
        builder.setInteligencia(2);
        builder.setForca(6);
        builder.setDestreza(10);
        builder.setVigor(8);
        builder.setResistencia(5);
    }

    void buildMago(Builder builder) {
        builder.setNome("Mago");
        builder.setTipo(TipoPersonagem.MAGO);
        builder.setInteligencia(10);
        builder.setForca(2);
        builder.setDestreza(4);
        builder.setVigor(5);
        builder.setResistencia(3);
    }
}
