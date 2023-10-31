package com.parasticaret.api.service.addressservices;

import com.parasticaret.api.model.addressmodels.Address;
import com.parasticaret.api.repository.addressrepositories.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    public AddressService(AddressRepository addressRepository, ModelMapper modelMapper){
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    public Set<Address> getCustomerAddress(){
        List<Address> addresses = addressRepository.findAll();

        return new HashSet<>(addresses);
    }
}
