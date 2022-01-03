package daw.wissenBE.service;

import daw.wissenBE.domain.Video;
import daw.wissenBE.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository){
        this.videoRepository = videoRepository;
    }

    public List<Video> getVideos() {
        return videoRepository.findAll();
    }

    public void addNewVideo(Video video){
        Optional<Video> videoByName = videoRepository
                .findVideoByName(video.getName());
        if(videoByName.isPresent()){
            throw new IllegalStateException("name taken");
        }
        videoRepository.save(video);
    }

    public void deleteVideo(Long videoId) {
        boolean exists = videoRepository.existsById(videoId);
        if(!exists) {
            throw new IllegalStateException("video with id " + videoId + " does not exists");
        }
        videoRepository.deleteById(videoId);
    }

    @Transactional
    public void updateVideo(Long videoId, String name, String valid_for, String description) {
        Video video = videoRepository.findById(videoId).orElseThrow(() -> new IllegalStateException(
                "video with id " + videoId + " does not exist"));

        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(video.getName(), name)) {
            Optional<Video> videoByName = videoRepository
                    .findVideoByName(name);
            if (videoByName.isPresent()) {
                throw new IllegalStateException("name taken");
            }
            video.setName(name);
        }

        if (description != null &&
                description.length() > 0 &&
                !Objects.equals(video.getDescription(), description)) {
            video.setDescription(description);
        }


    }
}
