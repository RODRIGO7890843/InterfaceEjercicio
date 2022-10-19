public abstract class Producto implements IProducto,IMercaderia {

    public abstract void verificarExistencia();
    public abstract void obtenerTipoProducto();
    @Override
    public boolean ingresar(){
        System.out.println("Ingresar");
        return false;
    }
    @Override
    public boolean darDeBaja(){
        System.out.println("darDeBaja");
        return false;
    }
}
