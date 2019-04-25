package DiscJockeyInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Enumeration;;

public class DiscJockey {

	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;

	SongIterator iter70s;
	SongIterator iter80s;
	SongIterator iter90s;
	
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		iter70s = newSongs70s;
		iter80s = newSongs80s;
		iter90s = newSongs90s;
	}
	
	public void showTheSongs() {
		ArrayList<SongInfo> aL70sSongs = songs70s.getBestSongs();
		
		System.out.println("Songs of the 70s \n");
		for(int i = 0; i < aL70sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
		
		System.out.println();

		SongInfo[] aL80sSongs = songs80s.getBestSongs();
		
		System.out.println("Songs of the 80s \n");
		for(int i = 0; i < aL80sSongs.length; i++) {
			SongInfo bestSongs = aL80sSongs[i];

			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}

		System.out.println();
		
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
		
		System.out.println("Songs of the 90s \n");
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());

			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
	}
	
	public void showItrTheSongs() {
		Iterator<SongInfo> songs70s = iter70s.createIterator();
		Iterator<SongInfo> songs80s = iter80s.createIterator();
		Iterator<SongInfo> songs90s = iter90s.createIterator();

		System.out.println("Songs of the 70s \n");
		printTheSongs(songs70s);
		System.out.println();
		
		System.out.println("Songs of the 80s \n");
		printTheSongs(songs80s);
		System.out.println();
		
		System.out.println("Songs of the 90s \n");
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator<SongInfo> iterator) {
		while (iterator.hasNext()){
			SongInfo song = iterator.next();
			System.out.println(song.getSongName());
			System.out.println(song.getBandName());
			System.out.println(song.getYearReleased());
		}
	}
}
