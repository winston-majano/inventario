package wm.inventario.Service;

import wm.inventario.model.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto>listarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    Producto guardarProducto(Producto producto);
    void eliminarProductoPorId(Integer idProducto);
}
