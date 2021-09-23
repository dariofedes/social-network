package com.codurance.socialnetwork.unit;

import com.codurance.socialnetwork.Console;
import com.codurance.socialnetwork.Post;
import com.codurance.socialnetwork.PostRepository;
import com.codurance.socialnetwork.SocialNetwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
class SocialNetworkShould {

	SocialNetwork socialNetwork;
	Console console;
	PostRepository postRepository;

	@BeforeEach
	void setup() {
		postRepository = mock(PostRepository.class);

		console = mock(Console.class);
		socialNetwork = new SocialNetwork(console, postRepository);
	}

	@Test
	void savePosts() {
		// when
		socialNetwork.post("Alice", "I love the weather today");

		// assert
		verify(postRepository).savePost("Alice", "I love the weather today");
	}

}
