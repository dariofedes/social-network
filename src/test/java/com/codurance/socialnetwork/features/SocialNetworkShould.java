package com.codurance.socialnetwork.features;

import com.codurance.socialnetwork.Console;
import com.codurance.socialnetwork.Post;
import com.codurance.socialnetwork.PostRepository;
import com.codurance.socialnetwork.SocialNetwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class SocialNetworkShould {



	Console console;
	SocialNetwork socialNetwork;
	PostRepository postRepository;

	@BeforeEach
	public void init() {
		console = mock(Console.class);
		postRepository = mock(PostRepository.class);
		socialNetwork = new SocialNetwork(console, postRepository);
	}

	@Test
	public void usersShouldBeAbleToPost() {
		socialNetwork.post("Alice", "I love the weather today");
		socialNetwork.read("Alice");
		verify(console).printLine("I love the weather today (5 minutes ago)");
	}

	@Test
	void name() {
	}
}
