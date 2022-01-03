package daw.wissenBE.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Video{

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
    private Long video_id;
    private String picture;
    private String link;
    private String name;
    private String length;
    private LocalDate release;
    private String tags;
    private String description;

    public Video() {
    }

    public Video(Long video_id, String picture, String link, String name, String length, LocalDate release, String tags, String description) {
        this.video_id = video_id;
        this.picture = picture;
        this.link = link;
        this.name = name;
        this.length = length;
        this.release = release;
        this.tags = tags;
        this.description = description;
    }

    public Video(String picture, String link, String name, String length, LocalDate release, String tags, String description) {
        this.picture = picture;
        this.link = link;
        this.name = name;
        this.length = length;
        this.release = release;
        this.tags = tags;
        this.description = description;
    }


    public Long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Long video_id) {
        this.video_id = video_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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
                "video_id=" + video_id +
                ", picture='" + picture + '\'' +
                ", link='" + link + '\'' +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", release='" + release + '\'' +
                ", tags='" + tags + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
