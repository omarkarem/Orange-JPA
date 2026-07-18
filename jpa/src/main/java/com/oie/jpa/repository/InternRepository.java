package com.oie.jpa.repository;

import com.oie.jpa.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InternRepository extends JpaRepository<Intern, Integer> {
    Optional<Intern> findByEmail(String email);

    List<Intern> findByTrackName(String trackName);

    List<Intern> findByMentorIsNull();

    List<Intern> findByMentorFullName(String mentorFullName);

    List<Intern> findByJoinDateAfter(LocalDate date);

    @Query("SELECT i FROM Intern i WHERE i.track.name = :trackName ORDER BY i.fullName")
    List<Intern> findByTrackNameOrdered(@Param("trackName") String trackName);

}
