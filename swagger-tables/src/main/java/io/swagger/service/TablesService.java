package io.swagger.service;

import io.swagger.model.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TablesService {
    List getAllTables();
    Table addTable(Table table);
    void removeTable(long id);
    Table getTable(long id);
}
