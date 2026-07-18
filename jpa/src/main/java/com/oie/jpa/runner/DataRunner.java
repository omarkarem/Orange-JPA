package com.oie.jpa.runner;

import com.oie.jpa.entity.*;
import com.oie.jpa.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataRunner implements CommandLineRunner {

    private final TrackRepository trackRepository;
    private final InternRepository internRepository;
    private final ProjectRepository projectRepository;

    public DataRunner(TrackRepository trackRepository, InternRepository internRepository,
            ProjectRepository projectRepository) {
        this.trackRepository = trackRepository;
        this.internRepository = internRepository;
        this.projectRepository = projectRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("All Tracks");
        List<Track> tracks = trackRepository.findAll();
        tracks.forEach(System.out::println);

        System.out.println("find intern by email");
        System.out.println(internRepository.findByEmail("omar.k@intern.com"));

        System.out.println("find interns with no mentor");
        internRepository.findByMentorIsNull().forEach(System.out::println);

        System.out.println("active projects");
        projectRepository.findByStatus(ProjectStatus.active).forEach(System.out::println);

        System.out.println("\n=== Project Count by Status ===");
        System.out.println("Active: " + projectRepository.countByStatus(ProjectStatus.active));
        System.out.println("Planned: " + projectRepository.countByStatus(ProjectStatus.planned));

    }

}
