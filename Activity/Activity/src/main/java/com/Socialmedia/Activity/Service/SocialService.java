package com.Socialmedia.Activity.Service;

import com.Socialmedia.Activity.DTO.SocialDTO;
import com.Socialmedia.Activity.Entity.SocialDAO;
import com.Socialmedia.Activity.Respository.SocialRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialService {
    @Autowired
    private SocialRepository socialRepository;

    private ModelMapper modelMapper = new ModelMapper();

    public SocialDTO ConvertSocialDAOToSocialDTO(SocialDAO socialDAO){
        return modelMapper.map(socialDAO,SocialDTO.class);
    }

    public SocialDAO ConvertSocialDTOToSocialDAO(SocialDTO socialDTO){
        return modelMapper.map(socialDTO,SocialDAO.class);

    }

    public List<SocialDAO> getAll() {
        List<SocialDAO> socialDAOS = socialRepository.findAll();
        return socialDAOS;
    }
}
