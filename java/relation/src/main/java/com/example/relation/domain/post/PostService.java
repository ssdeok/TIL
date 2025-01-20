package com.example.relation.domain.post;

import com.example.relation.domain.comment.Comment;
import com.example.relation.domain.comment.CommentRepository;
import com.example.relation.domain.post.dto.*;
import com.example.relation.domain.post.entity.Post;
import com.example.relation.domain.post.entity.PostTag;
import com.example.relation.domain.post.repository.PostRepository;
import com.example.relation.domain.post.repository.PostTagRepository;
import com.example.relation.domain.tag.Tag;
import com.example.relation.domain.tag.TagRepository;
import com.example.relation.domain.tag.dto.TagRequestDto;
import com.example.relation.domain.user.dto.response.Post2ResponseDto;
import com.example.relation.domain.user.entity.User;
import com.example.relation.global.common.service.FileService;
import com.example.relation.global.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;
    // DI를 하는것이기때문에 생성자가 필요. @RequiredArgsConstructor 이걸로 만듬
    private final CommentRepository commentRepository;
    private final TagRepository tagRepository;
    private final PostTagRepository postTagRepository;
    private final FileService fileService;
    private final Post22Repository post22Repositry;

    @Transactional
    public Post2ResponseDto createPost2(Post2CreateWithAuthorRequestDto requestDto, User user) {
        return Post2ResponseDto.from(post22Repositry.save(requestDto.toEntity(user)));
    }

    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto requestDto) {
        Post post = postRepository.save(requestDto.toEntity());
        return PostResponseDto.from(post);
    }

    public List<PostListResponseDto> readPosts(){
        log.info("read posts");
        return postRepository.findAll().stream()
                .map(PostListResponseDto::from)
                .toList();
    }

    public PostWithCommentResponseDto readPostById(Long id){
        log.info("read posts : {}", id);
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
//        comments 특정 post id를 가지고 있는 comments를 읽고 싶다
        List<Comment> comments = commentRepository.findByPostId(id);

        return PostWithCommentResponseDto.from(post, comments);
    }

    public PostWithCommentResponseDtoV2 readPostByIdV2(Long id) {
        // post, comment를 한번에 가져오고 싶다.
       Post post = postRepository.findByIdWithComment(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        return PostWithCommentResponseDtoV2.from(post);
    }

    @Transactional
    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        post.update(requestDto);

        return PostResponseDto.from(post);
    }

    @Transactional
    public void deletePost(Long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());

        postRepository.delete(post);
    }

    public List<PostListWithCommentCountResponseDto> readPostsWithCommentCount() {
        List<Object[]> results = postRepository.findAllWithCommentCount();
        return results.stream()
                .map(
                        result ->{
                            Post post = (Post) result[0];
                            Long CommentCount = (Long) result[1];
                            return new PostListWithCommentCountResponseDto(
                                    post.getId(),
                                    post.getTitle(),
                                    post.getCreatedAt(),
                                    CommentCount
                            );
                        })
                .toList();
    }

    public List<PostListWithCommentCountResponseDto> readPostWithCommentCountDto() {
        return postRepository.findAllWithCommentCountDTO();
    }

    @Transactional
    public void addTagToPost(Long id, TagRequestDto requestDto) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());

        Tag tag = tagRepository.findByName(requestDto.getName())
                .orElseThrow(() -> new ResourceNotFoundException());


        PostTag postTag = new PostTag();

        postTag.addTag(tag);
        postTag.addPost(post);

        post.getPostTags().add(postTag);

        postTagRepository.save(postTag);
    }

    public PostWithCommentAndTagResponseDto readPostsByIdWithCommentAndTag(Long id) {

//        Post post = postRepository.findByIdWithCommentAndTag(id)
//                .orElseThrow(() -> new ResourceNotFoundException());

        Post postWithTag = postRepository.findByIdWithTag(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        List<Comment> comments = commentRepository.findByPostId(id);

        return PostWithCommentAndTagResponseDto.from(postWithTag, comments);
    }

    public PostWithCommentAndTagResponseDtoV2 readPostsByIdWithCommentAndTagV2(Long id) {
        Post post = postRepository.findByIdWithCommentAndTag(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        return PostWithCommentAndTagResponseDtoV2.from(post);
    }

    public List<PostWithCommentAndTagResponseDtoV2> readPostsByTag(String tag) {
       return postRepository.findAllByTagName(tag).stream().map(
               PostWithCommentAndTagResponseDtoV2::from
       ) .toList();
    }

    public List<PostListResponseDto> readPostsWithPage(Pageable pageable) {
       return postRepository.findAll(pageable).getContent()
               .stream().map(
                PostListResponseDto::from
                ).toList();

    }

    public PostListWithPageResponseDto readPostWithPageDetail(Pageable pageable) {
      return PostListWithPageResponseDto.from(
              postRepository.findAll(pageable)
      );
    }

    public List<PostWithCommentResponseDtoV2> readPostsWithCommentPage(Pageable pageable) {
        return postRepository.findPostsWithCommnentPage(pageable)
                .getContent().stream().map(
                        PostWithCommentResponseDtoV2::from
                ).toList();
    }

    @Transactional
    public PostWithImageResponseDto createPostWithImage(
            PostCreateRequestDto requestDto,
            MultipartFile image) {

        String imageUrl = null;

        if (image != null && !image.isEmpty()) {
            imageUrl = fileService.saveFile(image);
        }

        Post post = requestDto.toEntity();
        post.setImageUrl(imageUrl);

        return PostWithImageResponseDto.from(
                postRepository.save(post)
        );
    }

}




























