package wm.inventario.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wm.inventario.Service.ProductoService;
import wm.inventario.model.Producto;

import java.util.List;

@RestController
@RequestMapping("inventario") //http://localhost:8081/inventario-app
@CrossOrigin(value = "http://localhost:4200") //puerto por defaul de angular
public class ProductoController {

    private static  final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;


    @GetMapping("/productos")
    public List<Producto> obtenerProducto(){
       List<Producto> productos =  this.productoService.listarProductos();
        logger.info("Productos obtenidos");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        logger.info("Producto a agregar: "+ producto);
        return  this.productoService.guardarProducto(producto);
    }
}
