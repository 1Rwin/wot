package com.filrob.wot.domain.cards.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMastaRepo extends CrudRepository<TestMasta, Integer> {
}
