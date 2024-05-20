package com.sparta.shop;

import com.sparta.shop.service.PostService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopApplicationTests {

    PostService postService;

    @PersistenceContext
    EntityManager em;

//    @Test
//    @Transactional
//    @Rollback(value = false)
//    void test(){
////        Item item = new Item();
////        item.setTitle("new");
////        item.setContent("new");
////        item.setPrice(1000L);
////        item.setUserName("new");
////
////        em.persist(item);
//        postService.getPostById(1L);
//    }


}
