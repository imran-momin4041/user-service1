package com.userservice.service;

import com.userservice.entity.Organization;
import com.userservice.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization saveOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization getOrganization(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}