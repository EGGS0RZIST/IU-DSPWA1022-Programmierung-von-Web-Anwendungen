package org.iu.dspwa1022.springmvc.lib;

import java.util.List;

public record Comment(String body, String postId) {

    public static List<Comment> sampleComments() {
        final var c1 = new Comment("Great Post!", "1");
        final var c2 = new Comment("Nice Post!", "1");
        final var c3 = new Comment("Awesome Post!", "2");
        return List.of(c1, c2, c3);
    }

}
