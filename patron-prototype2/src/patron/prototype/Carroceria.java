package patron.prototype;

import java.util.ArrayList;

public class Carroceria extends Ensamblaje {
	public static Carroceria _carroceria = null;
	
	public Carroceria() {
		super.autoPartes = new ArrayList<AutoParte>();
	}
	
	
	public static Carroceria nueva() {
		if(_carroceria == null)
			_carroceria = new Carroceria();
		return _carroceria;
	}
	
	public void addPart(AutoParte autoParte) {
		super.autoPartes.add(autoParte);
	}
	
	public void removePart(AutoParte autoParte) {
		super.autoPartes.remove(autoParte);
	}
	
	public void removeAll() {
		super.autoPartes.clear();
	}
	
	
}
