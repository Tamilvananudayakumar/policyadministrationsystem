package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.entity.Address;

import java.util.List;

public interface AddressService {


    Address addAddress(Address address);
    List<Address> getAllAddress();
    Address getAddressById(int id);
    Address updateAddress(Address address);
    void deleteAddressById(int id);

}
