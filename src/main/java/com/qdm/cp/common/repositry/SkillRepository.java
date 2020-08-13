package com.qdm.cp.common.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cp.model.Skills;
@Repository
public interface  SkillRepository extends CrudRepository<Skills, Long>{
	public List<Skills> findByAll();
}
