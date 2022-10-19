public class Lacteos extends Producto{

    @Override
    public void verificarExistencia() {
        System.out.println("Se verifica la exsitencia");
    }

    @Override
    public void obtenerTipoProducto() {
        System.out.println("Se obtiene el producto");
    }

    @Override
    public void comprar() {
    }
}
