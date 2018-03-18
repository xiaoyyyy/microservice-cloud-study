package com.spring.study.repository;

import com.spring.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 小&y on 2018/3/17 0017.
 *
 * @author 小&y
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
