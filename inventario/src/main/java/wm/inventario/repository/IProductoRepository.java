package wm.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wm.inventario.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
