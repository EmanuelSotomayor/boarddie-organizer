package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.entities.Image;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    public Image saveImage(MultipartFile file) throws IOException;
    public void deleteImageById(UUID id);
    public Image findImageById(UUID id);
    public List<Image> findAllImages();
    public Image updateImageById(UUID id, MultipartFile file) throws IOException;
}