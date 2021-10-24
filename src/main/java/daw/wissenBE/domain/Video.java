package daw.wissenBE.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Video")
public class Video {

    @Id
    private Long id;
    private String name;
    private String length;
    private String valid;


    public Video(Long id, String name, String length) {
        this.id = id;
        this.name = name;
        this.length = length;
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

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }
}
