package musicPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Song find_song(String song_title) {
        for(Song checkedSong : songs){
            if(checkedSong.getSong_title().equals(song_title)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addSong(String song_title, double song_duration) {
        if (find_song(song_title) == null) {
            songs.add(new Song(song_title, song_duration));
            return true;
        }
        else
            return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
//        System.out.println("this album does not have song with trackNumber "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String song_title, LinkedList<Song> PlayList) {
        for(Song checkedSong : this.songs){
            if (checkedSong.getSong_title().equals(song_title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
//        System.out.println(title + "there is no such song in album");
        return false;
    }
}
