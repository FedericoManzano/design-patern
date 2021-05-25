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
public class DaoRepositorio implements Repositorio<Usuario, Long>{

	@Override
	public void insertar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Usuario> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(Long obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> filtro(Long campo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarTodos(List<Usuario> listado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarPorCampo(Long campo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario actualizar(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}


}
