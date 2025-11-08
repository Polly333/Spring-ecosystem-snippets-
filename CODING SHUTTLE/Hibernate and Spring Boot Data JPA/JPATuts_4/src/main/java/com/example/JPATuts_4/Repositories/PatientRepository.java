package com.example.JPATuts_4.Repositories;

import com.example.JPATuts_4.DTO.BloodGroupStats;
import com.example.JPATuts_4.DTO.CPatientInfo;
import com.example.JPATuts_4.DTO.IPatientInfo;
import com.example.JPATuts_4.Entities.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

//    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
//    List<IPatientInfo> getAllPatientsInfo(); //can only read the data

    //List<Patient> getAllPatientsWithAppointments();


    //imp , can read and modify
    @Query("select new com.example.JPATuts_4.DTO.CPatientInfo(p.id, p.name) " +
            "from Patient p")
    List<CPatientInfo> getAllPatientsInfoConcrete();




    @Query("select new com.example.JPATuts_4.DTO.BloodGroupStats(p.bloodGroup, COUNT(p)) from Patient p group by p.bloodGroup order by COUNT(p) DESC")
    List<BloodGroupStats> getBloodGroupStats();

//    @Transactional
//    @Modifying
//    @Query("UPDATE Patient p set p.name = :name where p.id = :id")
//    int updatePatientNameWithId(@Param("name") String name, @Param("id") Long id);
//
//    @Query("select p from Patient p LEFT JOIN FETCH p.appointments")
//    List<Patient> getAllPatientsWithAppointments();
}