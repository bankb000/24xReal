package WebTest;


import javax.persistence.*;

/**
 * Created by bankza514 on 1/27/2017.
 */

@Entity
@Table(name = "Exhibition")
public class Exhibition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exhibitionId;
    private String exhibitionName;

    public Exhibition(int id, String name) {
        this.exhibitionId = id;
        this.exhibitionName = name;
    }

    public int getExhibitionId() {
        return exhibitionId;
    }

    public String getExhibitionName(){
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName){
        this.exhibitionName = exhibitionName;
    }
}
