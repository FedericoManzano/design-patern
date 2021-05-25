package patron.observer;

public interface Sujeto<T, M> {
	public void notificar(T receptor, M mensaje);
	public void notificarTodos(M mensaje);
}
