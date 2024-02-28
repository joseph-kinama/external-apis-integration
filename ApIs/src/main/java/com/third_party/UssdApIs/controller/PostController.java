package com.third_party.UssdApIs.controller;

import com.third_party.UssdApIs.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/getPosts")
    List<Map<String, Object>> getAllposts() {

        return postService.getPosts();
    }

    @GetMapping("/getPostsById/{id}")
    Map<String, Object> getPostByid(@PathVariable int id) {

        return postService.getPostsById(id);
    }

    @PostMapping("/insertPosts")
    Map<String, Object> insertPost(@RequestBody Map<String, Object> payload) {

        return postService.insertPosts(payload);
    }

    @PutMapping("/updatePosts/{id}")
    Map<String, Object> updatePost(@RequestBody Map<String, Object> payload, @PathVariable int id) {

        return postService.updatePosts(payload, id);
    }

    @DeleteMapping("/deletePosts/{id}")
    Map<String, Object> deletePosts(@PathVariable int id) {

        return postService.deletePost(id);
    }
}