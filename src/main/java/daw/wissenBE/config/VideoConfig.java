package daw.wissenBE.config;

import daw.wissenBE.domain.Video;
import daw.wissenBE.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VideoConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            VideoRepository repository) {
        return args -> {
            Video fortnite = new Video(
                    1L,
                    "Fortnite",
                    "20:40",
                    "yes"

            );
            Video CoD = new Video(
                    "CoD",
                    "15:20",
                    "yes"

            );

            repository.saveAll(
                    List.of(fortnite, CoD)
            );
        };
    }
}
