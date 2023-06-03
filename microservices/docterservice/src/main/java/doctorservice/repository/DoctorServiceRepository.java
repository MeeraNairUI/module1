package doctorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import doctorservice.entity.DoctorServiceEntity;

@Repository
public interface DoctorServiceRepository extends JpaRepository<DoctorServiceEntity , Long>{

}
