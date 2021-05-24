package patron.prototype;

import java.util.List;

public abstract class Ensamblaje {
	protected List<AutoParte> autoPartes;
	
	public List<AutoParte> obtenerPartes() {
		return this.autoPartes;
	}
}
