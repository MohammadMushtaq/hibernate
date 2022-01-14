package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.MedicineEntity;

public interface MedicineDAO {
	
	void save(MedicineEntity mediEntity);

	void saveAll(List<MedicineEntity> medicineEntities);
}
