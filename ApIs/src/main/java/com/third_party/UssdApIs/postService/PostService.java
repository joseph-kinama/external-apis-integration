package com.third_party.UssdApIs.postService;

import java.util.List;
import java.util.Map;

public interface PostService {

     List<Map<String, Object>> getPosts();
     Map<String,Object> getPostsById(int id);


     Map<String,Object> insertPosts(Map<String,Object> payload);

     Map<String,Object> updatePosts(Map<String,Object> payload, int id);

     Map<String,Object> deletePost(int id);

}
