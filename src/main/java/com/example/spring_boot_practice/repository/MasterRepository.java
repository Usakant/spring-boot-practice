package com.example.spring_boot_practice.repository;

import com.example.spring_boot_practice.model.Master;

public interface MasterRepository {
    public void saveMasterData();
    public Master getMasterData();
    public int updateMasterData();
    public void deleteMasterData();
}
