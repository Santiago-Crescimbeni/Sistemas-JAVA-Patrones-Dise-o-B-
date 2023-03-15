


public class Busqueda implements IBuscadorFacade  {
    private ApiHotel apiHotel;
    private ApiVuelo apiVuelo;

    public Busqueda(ApiHotel apiHotel, ApiVuelo apiVuelo) {
        this.apiHotel = apiHotel;
        this.apiVuelo = apiVuelo;
    }

    @Override
    public void realizarBusqueda(String fechaEntrada, String fechaSalida, String ciudad) {
        System.out.println("Disponibilidad de Hoteles encontrados : ");

        apiHotel.buscarHoteles(fechaEntrada, fechaSalida, ciudad);

        System.out.println("Disponibilidad de Vuelos Encontrados:  ");
        apiVuelo.buscarVuelos(fechaEntrada, fechaSalida,ciudad);
    }
}
