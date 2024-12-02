package LAB_04.AimsProject.src.hust.dsai.aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    //get
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    //construtor
    public Disc(String title){
        super(title);
    }
    public Disc(String title,String category,String director,float cost){
        super(title,category,cost);
        this.director=director;
    }
    public Disc(String title,String category,String director,int length,float cost){
        super(title,category,cost);
        this.director=director;
        this.length=length;
    }

    @Override
    public String toString() {
        return super.toString() + " length : " + getLength() + " director: " + getDirector();
    }
}
