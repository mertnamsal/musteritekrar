package com.mert.tekrarrrrr.service;

import com.mert.tekrarrrrr.repository.IMusteriRepository;
import com.mert.tekrarrrrr.repository.entity.Musteri;
import com.mert.tekrarrrrr.utiliy.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class MusteriService extends ServiceManager<Musteri,Long> {

    public MusteriService(IMusteriRepository repository){
        super(repository);
    }


}
