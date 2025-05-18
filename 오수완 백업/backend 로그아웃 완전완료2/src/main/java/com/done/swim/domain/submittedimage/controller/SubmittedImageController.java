package com.done.swim.domain.submittedimage.controller;

import com.done.swim.domain.pool.entity.Pool;
import com.done.swim.domain.submittedimage.dto.requestdto.SubmittedImageRequestDto;
import com.done.swim.domain.submittedimage.dto.responsedto.SubmittedImageResponseDto;
import com.done.swim.domain.submittedimage.service.SubmittedImageService;
import com.done.swim.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class SubmittedImageController {

    private final SubmittedImageService submittedImageService;

    @PostMapping
    public SubmittedImageResponseDto createImage(
            @RequestPart("pool") Pool pool,
            @AuthenticationPrincipal User user,
            @RequestPart("file") MultipartFile file) {
        log.info("file : {}", file.getOriginalFilename());
        SubmittedImageRequestDto requestDto = SubmittedImageRequestDto.builder()
                .pool(pool)
                .user(user)
                .file(file)
                .build();

        return submittedImageService.createImage(requestDto);
    }

    @GetMapping("/{id}")
    public SubmittedImageResponseDto getImageById(@PathVariable Long id) {
        return submittedImageService.getImageById(id);
    }

    @GetMapping
    public List<SubmittedImageResponseDto> getImages() {
        return submittedImageService.getImages();
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id) {
        submittedImageService.deleteImage(id);
    }
}
