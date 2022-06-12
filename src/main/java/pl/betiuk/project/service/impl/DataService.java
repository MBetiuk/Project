package pl.betiuk.project.service.impl;

import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Agency;
import pl.betiuk.project.repository.AgencyRepository;
import pl.betiuk.project.repository.EmployeeRepository;

@Service
public class DataService {

    private AgencyRepository agencyRepository;
    private EmployeeRepository employeeRepository;


    public DataService(AgencyRepository agencyRepository, EmployeeRepository employeeRepository) {
        this.agencyRepository = agencyRepository;
        this.employeeRepository = employeeRepository;
    }
    //agency


    public void loadData() {
        Agency agency1 = new Agency();
        agency1.setAgencyNo("1001");
        agencyRepository.save(agency1);

        Agency agency2 = new Agency();
        agency2.setAgencyNo("1009");
        agencyRepository.save(agency2);

        Agency agency3 = new Agency();


        agency3.setAgencyNo("1018");
        agencyRepository.save(agency3);

    }
    //AM
}
