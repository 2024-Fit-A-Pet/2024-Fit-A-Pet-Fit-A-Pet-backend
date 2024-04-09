package fitapet.backend.fit_a_pet.controller;

import fitapet.backend.fit_a_pet.service.S3Service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class S3Controller {

    @Autowired
    private S3Service s3Service;

    @PostMapping(path = "/teams", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadPetImage(
            @RequestPart(value = "name") String dirName,
            @RequestPart(value = "file", required = false) MultipartFile multipartFile
    ) throws IOException {
        s3Service.upload(multipartFile, "pet_picture");
        return new ResponseEntity(null, HttpStatus.OK);
    }
}
