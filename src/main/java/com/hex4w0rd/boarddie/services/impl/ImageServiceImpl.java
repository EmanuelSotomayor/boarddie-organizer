package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.entities.Image;
import com.hex4w0rd.boarddie.exceptions.ImageException;
import com.hex4w0rd.boarddie.repositories.ImageRepository;
import com.hex4w0rd.boarddie.services.IImageService;
import com.hex4w0rd.boarddie.services.IMessageService;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageServiceImpl implements IImageService {

    private final ImageRepository imageRepository;
    private final IMessageService messageService;

    @Value("${upload.extensions}")
    private String propertiesValues;

    public ImageServiceImpl(ImageRepository imageRepository, IMessageService messageService){
        this.imageRepository = imageRepository;
        this.messageService = messageService;
    }

    @Override
    public Image saveImage(MultipartFile file) throws IOException {
        if(this.validExtensionImage(file.getOriginalFilename())){
            Image image = new Image();
            byte[] deserializedFile = file.getBytes();
            image.setTitle(file.getOriginalFilename());
            image.setHash(deserializedFile);
            image.setSize(new BigInteger(String.valueOf(deserializedFile.length)));
            return this.imageRepository.save(image);
        }else{
            return null;
        }
    }
    @Override
    public void deleteImageById(Long id) {
        Optional<Image> imageExists = this.imageRepository.findById(id);
        imageExists.orElseThrow(() -> new ImageException(HttpStatus.NOT_FOUND,
                this.messageService.getProperty("image.not.found")));
        this.imageRepository.deleteById(id);
    }
    @Override
    public Image findImageById(Long id) {
        Optional<Image> imageExists = this.imageRepository.findById(id);
        imageExists.orElseThrow(() -> new ImageException(HttpStatus.NOT_FOUND,
                this.messageService.getProperty("image.not.found")));
        return imageExists.get();
    }
    @Override
    public List<Image> findAllImages() {
        return this.imageRepository.findAll();
    }
    @Override
    public Image updateImageById(Long id, MultipartFile file) throws IOException {
        Optional<Image> imageExists = this.imageRepository.findById(id);
        imageExists.orElseThrow(() -> new ImageException(HttpStatus.NOT_FOUND,
                this.messageService.getProperty("image.not.found")));
        if(this.validExtensionImage(file.getOriginalFilename())){
            imageExists.get().setTitle(file.getOriginalFilename());
            imageExists.get().setHash(file.getBytes());
            imageExists.get().setSize(new BigInteger(String.valueOf(file.getSize())));
            return this.imageRepository.save(imageExists.get());
        }else{
            return null;
        }
    }
    private Boolean validExtensionImage(String completeResourceName){
        /*Creamos un Stream por cada valor que traemos de la property que está separado por coma.
        Es decir, cada que encuentre una coma, creará un nuevo Objeto del tipo String
        con el valor que le corresponde consiguiente a la coma*/
        List<String> propertiesValues = Stream.of(this.propertiesValues.split(","))
                .map(elem -> new String(elem))
                .collect(Collectors.toList());

        for(String extension: propertiesValues){
            if(completeResourceName.contains(extension)){
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;

    }

}