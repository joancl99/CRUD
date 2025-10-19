import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
import java.util.List;

public class ArticulosManager 
{
    private static final String BD_FILE = "CRUD.yap";
    final private ObjectContainer db;

    public ArticulosManager() 
    {
        db = Db4o.openFile(BD_FILE);
    }

    public void close() {
        db.close();
    }

    // 1. Guardar un artículo en la base de datos
    public void saveArticulo(Articulos articulo) {
        db.store(articulo);
    }

    // 2. Buscar artículos por código
    public Articulos findArticuloByCodigo(int codigo) {
        Query query = db.query();
        query.constrain(Articulos.class);
        query.descend("codigo").constrain(codigo).equal();
        List<Articulos> result = query.execute();
        return result.isEmpty() ? null : result.get(0);
    }

    // 3. Obtener todos los artículos
    public List<Articulos> getAllArticulos() {
        Query query = db.query();
        query.constrain(Articulos.class);
        return query.execute();
    }

    // 4. Actualizar un artículo
    public void updateArticulo(Articulos articulo) {
        Articulos existingArticulo = findArticuloByCodigo(articulo.getCodigo());
        if (existingArticulo != null) {
            existingArticulo.setNombre(articulo.getNombre());
            existingArticulo.setCantidad(articulo.getCantidad());
            existingArticulo.setDescripcion(articulo.getDescripcion());
            db.store(existingArticulo);  // Guarda la modificación
        }
    }

    // 5. Eliminar un artículo por código
    public void deleteArticulo(int codigo) {
        Articulos articulo = findArticuloByCodigo(codigo);
        if (articulo != null) {
            db.delete(articulo);
        }
    }
}