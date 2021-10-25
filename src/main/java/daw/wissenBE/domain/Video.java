package daw.wissenBE.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Video {

    @Id
    @SequenceGenerator(
            name = "video_sequence",
            sequenceName = "video_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "video_sequence"
    )
    private Long id;
    private String name;
    private String length;
    private String valid_for;
    private Date release_date;
    private String description;


    public Video() {
    }

    public Video(Long id, String name, String length, String valid_for) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.valid_for = valid_for;
        this.release_date = release_date;
        this.description = description;
    }

    public Video(String name, String length, String valid_for) {
        this.name = name;
        this.length = length;
        this.valid_for = valid_for;
        this.release_date = release_date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getValid_for() {
        return valid_for;
    }

    public void setValid_for(String valid) {
        this.valid_for = valid;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", valid_for='" + valid_for + '\'' +
                ", release_date=" + release_date +
                ", description='" + description + '\'' +
                '}';
    }
}
