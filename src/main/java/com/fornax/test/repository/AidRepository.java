package com.fornax.test.repository;

/*
 * Created by Adam Bodansky on 2017.06.06..
 */

import com.fornax.test.domain.Aid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AidRepository extends JpaRepository<Aid, Long> {
}
