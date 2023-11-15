package com.gadeClasses.DMS.DMSrepository;
/**
*
*@author Meghana Gade S559865
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gadeClasses.DMS.Models.Dog;

import java.util.List;



@Repository
public interface DogRepository extends CrudRepository<com.gadeClasses.DMS.Models.Dog,Integer>{

	List<Dog> findByName(String name);
}
