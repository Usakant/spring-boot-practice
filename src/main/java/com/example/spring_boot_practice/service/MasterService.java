package com.example.spring_boot_practice.service;

import com.example.spring_boot_practice.model.Master;

public interface MasterService {
    public void saveMasterRequest();
    public Master getMasterRequest();
    public int updateMasterRequest();
    public void deleteMasterRequest();
}
