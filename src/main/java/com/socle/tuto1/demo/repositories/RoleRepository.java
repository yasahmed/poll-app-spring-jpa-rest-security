package com.socle.tuto1.demo.repositories;

import com.socle.tuto1.demo.domains.Role;
import com.socle.tuto1.demo.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}