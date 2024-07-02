package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
