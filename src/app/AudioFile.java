package app;

import utils.TimeTools;
import com.mpatric.mp3agic.*;
import java.io.IOException;
import utils.ITagEditable;

/**
 * Třída uchovávající jeden mp3 soubor a umožňující editaci jeho tagů
 * @author Radek Mocek
 */
public class AudioFile implements ITagEditable {

    private Mp3File file;
    
    /**
     * Konstruktor
     * @param path Absolutní cesta k mp3 souboru (String)
     */
    public AudioFile(String path) {
        try {
            file = new Mp3File(path);
        } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
            System.out.println("Chyba č.1: " + ex);
        }
    }

    /**
     * Vrací zformátovaný String pro výpis informací získaných z tagů souboru
     * @return String
     */
    @Override
    public String toString() {
        ID3v2 tag = file.getId3v2Tag();
        String artist = tag.getArtist();
        String year = tag.getYear();
        String album = tag.getAlbum();
        
        String trackNum = tag.getTrack();
        if (trackNum.contains("/")) trackNum = trackNum.split("/")[0];
        
        String title = tag.getTitle();        
        String absolutepath = file.getFilename();
        
        long seconds = file.getLengthInSeconds();
        String duration = TimeTools.longToString(seconds);
                
        return String.format("%-20.20s %-5.5s %-20.20s %3s. %-40s %8s %s", artist, year, album, trackNum, title, duration, absolutepath);        
    }    
    
}