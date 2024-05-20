package com.sparta.shop.repository;

import com.sparta.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PostRepository extends JpaRepository<Item, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Item i SET i.title = :title, i.contents = :contents, i.price = :price, i.userName= :username WHERE i.id = :id")
    int updateItemById(@Param("id") Long id, @Param("title") String title,
                       @Param("contents") String contents, @Param("price") long price,
                       @Param("username") String username);
}
