package wm.inventario.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wm.inventario.model.Producto;
import wm.inventario.repository.IProductoRepository;

import java.util.List;


@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
             System.out.println("Los productos son: "+productoRepository.findAll());
        return this.productoRepository.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto = this.productoRepository.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public Producto guardarProducto(Producto producto) {
      return this.productoRepository.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        this.productoRepository.deleteById(idProducto);
    }
}
