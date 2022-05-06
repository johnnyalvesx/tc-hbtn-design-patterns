public class AudioPlayer implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(TipoMedia tipo, String nome) {

        if (tipo.equals(TipoMedia.MP3)) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            mediaPlayerAdapter = new MediaPlayerAdapter(tipo);
            mediaPlayerAdapter.reproduzir(tipo, nome);
        }
    }
}
