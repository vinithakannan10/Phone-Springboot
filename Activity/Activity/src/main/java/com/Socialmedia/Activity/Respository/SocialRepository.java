package com.Socialmedia.Activity.Respository;

import com.Socialmedia.Activity.Entity.SocialDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<SocialDAO , Integer> {

}
