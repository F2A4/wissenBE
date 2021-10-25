package daw.wissenBE.controller;

import daw.wissenBE.domain.Video;
import daw.wissenBE.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "daw/video")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService){
        this.videoService = videoService;
    }

    @GetMapping
    public List<Video> getVideo(){
        return videoService.getVideos();
    }

    @PostMapping
    public void registerNewVideo(@RequestBody Video video){
        videoService.addNewVideo(video);
    }

    @DeleteMapping(path = "{videoId}")
    public void deleteVideo(
            @PathVariable("videoId") Long videoId){
        videoService.deleteVideo(videoId);
    }

    @PutMapping(path = "{videoId}")
    public void updateVideo(
            @PathVariable("videoId") Long videoId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String valid_for,
            @RequestParam(required = false) String description) {
        videoService.updateVideo(videoId, name, valid_for, description);
    }
}
