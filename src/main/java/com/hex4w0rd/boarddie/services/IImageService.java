package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.entities.Image;
import java.io.IOException;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    public Image saveImage(MultipartFile file) throws IOException;
    public void deleteImageById(Long id);
    public Image findImageById(Long id);
    public List<Image> findAllImages();
    public Image updateImageById(Long id, MultipartFile file) throws IOException;
}