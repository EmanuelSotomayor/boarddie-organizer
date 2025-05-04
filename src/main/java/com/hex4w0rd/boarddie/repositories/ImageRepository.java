package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Image;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, UUID> {
}
