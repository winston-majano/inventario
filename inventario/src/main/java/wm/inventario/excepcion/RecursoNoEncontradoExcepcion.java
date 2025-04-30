package wm.inventario.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExcepcion  extends RuntimeException{

    public RecursoNoEncontradoExcepcion(String message) {
        super(message);
    }
}
