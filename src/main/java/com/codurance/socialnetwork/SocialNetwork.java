package com.codurance.socialnetwork;

public class SocialNetwork {
    private Console console;
    private IPostRepository postRepository;

    public SocialNetwork(Console console, IPostRepository postRepository) {
        this.console = console;
        this.postRepository = postRepository;
    }

    public void post(String username, String message){
        postRepository.savePost(username, message);
    }

    public void read(String username) {

    }
}
