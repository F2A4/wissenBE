package daw.wissenBE.controller;

import daw.wissenBE.domain.Video;
import daw.wissenBE.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/video")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService){
        this.videoService = videoService;
    }

    @GetMapping("/all")
    public List<Video> getVideo(){
        return videoService.getVideos();
    }

    @PostMapping("/add")
    public void registerNewVideo(@RequestBody Video video){
        videoService.addNewVideo(video);
    }

    @DeleteMapping("/delete/{videoId}")
    public void deleteVideo(
            @PathVariable("videoId") Long videoId){
        videoService.deleteVideo(videoId);
    }

    @PutMapping( "/update/{videoId}")
    public void updateVideo(
            @PathVariable("videoId") Long videoId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String tags,
            @RequestParam(required = false) String description) {
        videoService.updateVideo(videoId, name, tags, description);
    }
}
