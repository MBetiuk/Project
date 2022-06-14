package pl.betiuk.project.service.impl;

import org.springframework.stereotype.Service;
import pl.betiuk.project.model.*;
import pl.betiuk.project.repository.*;

@Service
public class DataService {


    private final AgencyRepository agencyRepository;
    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;
    private final ClientRepository clientRepository;
    private final AddressRepository addressRepository;


    public DataService(AgencyRepository agencyRepository, EmployeeRepository employeeRepository, UserRepository userRepository, EmployeeRepository employeeRepository1, ClientRepository clientRepository, AddressRepository addressRepository) {
        this.agencyRepository = agencyRepository;
        this.userRepository = userRepository;
        this.employeeRepository = employeeRepository;
        this.clientRepository = clientRepository;
        this.addressRepository = addressRepository;
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

        User user1 = new User();
        user1.setNick("babcia");
        user1.setEmail("babcia@gmail.com");
        user1.setUserTypeEnum(UserTypeEnum.ADMIN);
        user1.setPassword("babcia");
        userRepository.save(user1);
        User user2 = new User();
        user2.setNick("dziadek");
        user2.setUserTypeEnum(UserTypeEnum.USER);
        user2.setEmail("dziadek@gmail.com");
        user2.setPassword("dziadek");
        userRepository.save(user2);


        Employee employee1 = new Employee();
        employee1.setFirstName("Adam");
        employee1.setLastName("Mickiewicz");
        employee1.setEmployeeTypeEnum(EmployeeTypeEnum.AM);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Maria");
        employee2.setLastName("Konopnicka");
        employee2.setEmployeeTypeEnum(EmployeeTypeEnum.DM);
        employee2.setSuperVisor(employee1);
        employeeRepository.save(employee2);



        Address address1 = new Address();
        address1.setId(2L);
        address1.setStreetName("Koperkowa");
        address1.setStreetName("7");
        address1.setHouseNo("12");
        address1.setPostCode("87-100");
        address1.setPostTown("Toruń");
        address1.setTown("Toruń");
        addressRepository.save(address1);

        Client client1 = new Client();
        client1.setId(1L);
        client1.setFirstName("Jan");
        client1.setLastName("Matejko");
        client1.setPesel("90060804786");
        client1.setAddress(address1);
        clientRepository.save(client1);

    }
    //AM
}
