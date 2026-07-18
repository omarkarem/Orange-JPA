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

    public DataRunner(TrackRepository trackRepository, InternRepository internRepository) {
        this.trackRepository = trackRepository;
        this.internRepository = internRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("All Tracks");
        List<Track> tracks = trackRepository.findAll();
        tracks.forEach(System.out::println);

        System.out.println("find intern by email");
        System.out.println(internRepository.findByEmail("omar.k@intern.com"));
        System.out.println(internRepository.findByMentorIsNull());

    }

}
