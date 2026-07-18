package com.oie.jpa.repository;

import com.oie.jpa.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface InternRepository extends JpaRepository<Intern, Integer> {
    Optional<Intern> findByEmail(String email);

    List<Intern> findByTrackName(String trackName);

    List<Intern> findByMentorIsNull();

    List<Intern> findByMentorFullName(String mentorFullName);

    List<Intern> findByJoinDateAfter(LocalDate date);

}
