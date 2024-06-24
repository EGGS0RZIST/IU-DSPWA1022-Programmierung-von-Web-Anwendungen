package org.iu.dspwa1022.springmvc.lib;

import java.util.List;

public record Post(String id, String title) {

    public static List<Post> samplePosts() {
        final var post1 = new Post("1", "Post 1");
        final var post2 = new Post("2", "Post 2");
        final var post3 = new Post("3", "Post 3");
        return List.of(post1, post2, post3);
    }

}
