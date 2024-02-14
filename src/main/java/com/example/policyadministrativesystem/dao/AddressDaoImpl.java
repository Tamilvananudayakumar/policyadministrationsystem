package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.Address;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressDaoImpl implements AddressDao{
    @Autowired
    EntityManager entityManager;
    @Override
    public Address addAddress(Address address) {
        return entityManager.merge(address);
    }

    @Override
    public List<Address> getAllAddress() {
        TypedQuery<Address> typedQuery=entityManager.createQuery("from Address ", Address.class);
        List<Address> addresses=typedQuery.getResultList();
        return addresses;
    }

    @Override
    public Address getAddressById(int id) {
        return entityManager.find(Address.class,id);
    }

    @Override
    public Address updateAddress(Address address) {
        return entityManager.merge(address);
    }

    @Override
    public void deleteAddressById(int id) {
        Address address=entityManager.find(Address.class,id);
        entityManager.remove(address);
    }
}
