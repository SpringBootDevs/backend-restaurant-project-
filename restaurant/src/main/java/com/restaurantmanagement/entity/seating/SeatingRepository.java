package com.restaurantmanagement.entity.seating;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatingRepository extends JpaRepository<Seating, Long> {
	Page<Seating> findByisAvailable(Boolean isAvailable, Pageable pageable);
}
