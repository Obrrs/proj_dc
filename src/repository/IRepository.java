package repository;

import exceptions.DataAccessException;
import exceptions.EntityNotFoundException;
import java.util.List;

public interface IRepository<T> {
    void adicionar(T item) throws DataAccessException;
    T buscarPorId(int id) throws EntityNotFoundException, DataAccessException;
    List<T> listarTodos() throws DataAccessException;
    void atualizar(T item) throws EntityNotFoundException, DataAccessException;
    void remover(int id) throws EntityNotFoundException, DataAccessException;
}