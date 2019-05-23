package io.swagger.service;

import io.swagger.model.Table;
import io.swagger.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TablesServiceImpl implements TablesService {
    @Autowired
    private TableRepository tableRepository;


    @Override
    public List getAllTables() {
        return tableRepository.findAll();
    }

    @Override
    public Table addTable(Table table) {
        return tableRepository.save(table);
    }

    @Override
    public void removeTable(long id) {
        tableRepository.delete(id);
    }

    @Override
    public Table getTable(long id) {
        return tableRepository.findOne(id);
    }
}
