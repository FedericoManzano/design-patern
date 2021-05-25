package patron.facade;

import java.util.List;
import java.util.Optional;

public interface Facade<T,S> {
	public void insertar(T obj);
	public Optional<T> buscarPorId(S id);
	public List<T> listarTodos();
	public T actualizar(T obj);
}
