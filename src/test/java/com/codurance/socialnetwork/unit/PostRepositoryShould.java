package com.codurance.socialnetwork.unit;

import com.codurance.socialnetwork.Post;
import com.codurance.socialnetwork.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class PostRepositoryShould {

    PostRepository postRepository;
    Post post;
    List<Post> posts;

    @BeforeEach
    void setup() {
        post = mock(Post.class);
        posts = mock(List.class);
        postRepository = new PostRepository(posts);
    }

    @Test
    void createNewPost() {
        //
        postRepository.savePost("Alice", "I love the weather today");

        //assert
        verify(posts).add(any(Post.class));
    }
}
