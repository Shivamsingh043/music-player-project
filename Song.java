package musicPlayer;

public class Song {
    public String song_title;
    public double song_duration;

    public Song(String song_title, double song_duration) {
        this.song_title = song_title;
        this.song_duration = song_duration;
    }

    public String getSong_title() {
        return song_title;
    }
    public double getSong_duration() {
        return song_duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + song_title + '\'' +
                ", duration=" + song_duration +
                '}';
    }
}
