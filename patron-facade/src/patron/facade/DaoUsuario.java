package patron.facade;

import java.util.List;
import java.util.Optional;

public class DaoUsuario implements Facade<Usuario, Long>{

	
	private Repositorio<Usuario, Long> repositorio = new DaoRepositorio();
	
	
	@Override
	public void insertar(Usuario obj) {
		repositorio.insertar(obj);
		
	}

	@Override
	public Optional<Usuario> buscarPorId(Long id) {
		return repositorio.buscarPorId(id);
	}

	@Override
	public List<Usuario> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public Usuario actualizar(Usuario obj) {
		return repositorio.actualizar(obj);
	}

}
