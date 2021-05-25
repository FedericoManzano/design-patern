package patron.facade;

import java.util.List;
import java.util.Optional;


/**
 * 
 * Ejemplo de un repositorio implementado de manera completa
 * Sin implementar
 * @author federico
 *
 */
public class DaoRepositorio<T,S> implements Repositorio<T, S>{

	@Override
	public void insertar(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<T> buscarPorId(S id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T buscar(S obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> filtro(S campo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarTodos(List<T> listado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarPorCampo(S campo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T actualizar(T obj) {
		// TODO Auto-generated method stub
		return null;
	}


}
