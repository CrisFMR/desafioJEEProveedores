package cl.praxis.model.dao;

import java.util.List;

import cl.praxis.model.dto.Proveedores;

public interface ProveedorDAO {
	
	void create(Proveedores p);
	Proveedores read(int id);
	List<Proveedores> read();
	void update(Proveedores p);
	void delete (int id);
	

}
