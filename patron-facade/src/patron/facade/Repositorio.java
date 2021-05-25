package patron.facade;

import java.util.List;
import java.util.Optional;

public interface Repositorio<T,S> {
	public void insertar(T obj);
	public Optional<T> buscarPorId(S id);
	public T buscar(S obj);
	public void borrar(T obj);
	public List<T> listarTodos();
	public List<T> filtro(S campo);
	public void borrarTodos(List<T> listado);
	public void borrarPorCampo(S campo);
	public T actualizar(T obj);
	
}
