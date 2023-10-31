package com.parasticaret.api.controllers.addresscontrollers;

import com.parasticaret.api.model.addressmodels.Address;
import com.parasticaret.api.service.addressservices.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/v1/address")
public class AddressController {

    private final AddressService addressService;

     public AddressController(AddressService addressService){
         this.addressService = addressService;
     }

     @GetMapping
     public ResponseEntity<Set<Address>> getCustomerAddresses(){
        return ResponseEntity.ok(addressService.getCustomerAddress());
     }
}
