package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Board;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, UUID> {
}
