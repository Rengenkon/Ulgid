package ru.rengen.Ulgid.telegram.models.repositorys.company;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeesRepository {
    private List<Record> eployees;

    private EmployeesRepository() {
        eployees = new ArrayList<>();
    }

    public void add(Long company, Long user) {
        eployees.add(new Record(company, user));
    }

    @Data
    class Record {
        private Long companyID;
        private Long userID;

        public Record(Long company, Long user) {
            this.companyID = company;
            this.userID = user;
        }
    }
}
