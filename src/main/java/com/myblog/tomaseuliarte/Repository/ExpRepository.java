
package com.myblog.tomaseuliarte.Repository;

import com.myblog.tomaseuliarte.Model.Exp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Exp, Long> {
}
