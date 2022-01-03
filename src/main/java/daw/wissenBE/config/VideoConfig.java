package daw.wissenBE.config;

import daw.wissenBE.domain.Video;
import daw.wissenBE.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class VideoConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            VideoRepository repository) {
        return args -> {
            Video fortnite = new Video(
                    "cringe",
                    "https://www.google.com/imgres?",
                    "Fortnite",
                    "20:20",
                    LocalDate.of(2021,Month.JANUARY,16),
                    "Toll",
                    "Ein krasses Video"

            );
            Video CoD = new Video(
                    "hello",
                    "https://www.google.com/imgres?",
                    "CoD",
                    "15:20",
                    LocalDate.of(2021,Month.JANUARY,12),
                    "Skill",
                    "Ein Wunderschönes Video"
            );

            repository.saveAll(
                    List.of(fortnite, CoD)
            );
        };
    }
}
