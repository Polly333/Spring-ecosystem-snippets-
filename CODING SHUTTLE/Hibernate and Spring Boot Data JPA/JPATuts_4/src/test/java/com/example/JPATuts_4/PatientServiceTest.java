package com.example.JPATuts_4;

import com.example.JPATuts_4.DTO.BloodGroupStats;
import com.example.JPATuts_4.DTO.CPatientInfo;
import com.example.JPATuts_4.DTO.IPatientInfo;
import com.example.JPATuts_4.Entities.Patient;
import com.example.JPATuts_4.Repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {

     //by using dummy dto
        //List<IPatientInfo> patientList = patientRepository.getAllPatientsInfo();


     // List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
   List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();
//
//        for(var p: patientList) {
//            System.out.println(p);
//        }

//        int rowsAffected = patientRepository.updatePatientNameWithId("Anuj Sharma", 1L);
//
//        System.out.println(rowsAffected);

       // List<Patient> patientList = patientRepository.getAllPatientsWithAppointments();

        for(var p: patientList) {
            System.out.println(p);
        }
    }
}
