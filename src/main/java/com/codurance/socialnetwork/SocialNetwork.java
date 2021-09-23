package com.codurance.socialnetwork;

public class SocialNetwork {
    private Console console;
    private PostRepository postRepository;

    public SocialNetwork(Console console, PostRepository postRepository) {
        this.console = console;
        this.postRepository = postRepository;
    }

    public void post(String username, String message) {
        Post post = new Post();

        postRepository.savePost(post);
    }

    public void read(String username) {

    }
}
