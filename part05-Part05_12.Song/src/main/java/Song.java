
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public boolean equals(Object compared){
        // check if the position of the variables are same
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Song)){
            return false;
        }
        
        // cast the passed object to the Song class
        Song cp = (Song) compared;
        
        if(this.artist.equals(cp.artist)
                && this.name.equals(cp.name)
                && this.durationInSeconds == cp.durationInSeconds){
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
