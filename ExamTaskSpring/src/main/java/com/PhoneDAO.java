package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneDAO {

    @Autowired
    private PhoneRepository phoneRepository;

    Phone findEntityById(int id){
        return phoneRepository.findById(id).get();
    }

    List<Phone> findAll(){
        return phoneRepository.findAll();
    }

    void delete(int id){
        phoneRepository.deleteById(id);
    }

    void delete(Phone phone){
        phoneRepository.delete(phone);
    }

    void create(Phone phone){
        phoneRepository.save(phone);
    }

    Phone update(Phone phone){
        phoneRepository.save(phone);
        return phone;
    }
}
