package me.aleishawalters.payrollsystem.repositories;

import me.aleishawalters.payrollsystem.models.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company,Integer> {
    List<Company> findByCompanyCode(String companyCode);
}
