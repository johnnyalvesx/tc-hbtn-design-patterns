public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {

        if (!tipoMedia.equals(TipoMedia.MP3)) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipo, String nome) {

        if (tipo.equals(TipoMedia.VLC)) {
            advancedMediaPlayer.reproduzirVlc(nome);
        } else if (tipo.equals(TipoMedia.MP4)) {
            advancedMediaPlayer.reproduzirMp4(nome);

        }
    }
}
