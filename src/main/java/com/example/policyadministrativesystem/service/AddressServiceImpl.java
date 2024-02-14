package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.dao.AddressDao;
import com.example.policyadministrativesystem.dao.PolicyDao;
import com.example.policyadministrativesystem.entity.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressDao addressDao;
    @Transactional
    @Override
    public Address addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressDao.getAllAddress();
    }

    @Override
    public Address getAddressById(int id) {
        return addressDao.getAddressById(id);
    }
    @Transactional
    @Override
    public Address updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }
    @Transactional
    @Override
    public void deleteAddressById(int id) {
        addressDao.deleteAddressById(id);
    }
}
