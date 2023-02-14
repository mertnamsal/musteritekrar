package com.mert.tekrarrrrr.controler;

import com.mert.tekrarrrrr.repository.entity.Musteri;
import com.mert.tekrarrrrr.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.mert.tekrarrrrr.constant.EndPoints.*;

@RestController
@RequestMapping(MUSTERI)
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService musteriService;


    @GetMapping(SAVE)
    public ResponseEntity<Musteri> save(String ad,String soyad,String telefon,String email){
        Musteri musteri = Musteri.builder()
                .ad(ad)
                .soyad(soyad)
                .telefon(telefon)
                .email(email)
                .build();
        musteriService.save(musteri);
        return ResponseEntity.ok(musteri);
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Musteri>> findAll(){
        return ResponseEntity.ok(musteriService.findAll());
    }
    @GetMapping(DELETE)
    public List<Musteri> deleteById(Long id){
        musteriService.deleteById(id);
        return musteriService.findAll();
    }

}
