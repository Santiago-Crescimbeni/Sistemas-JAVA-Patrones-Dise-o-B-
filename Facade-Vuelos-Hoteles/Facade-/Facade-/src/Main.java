
public class Main {

    public static void main(String[] args) {
        // write your code here
        Vuelo vuelo1= new Vuelo("2020", "02", "Buenos Aires", "Madrid");
        Vuelo vuelo2= new Vuelo("2020", "02", "Buenos Aires", "New York");
        Vuelo vuelo3= new Vuelo("2020", "02", "Buenos Aires", "EEUU");



        ApiVuelo apiVuelo = new ApiVuelo();
        apiVuelo.agregarVuelos(vuelo1);
        apiVuelo.agregarVuelos(vuelo2);
        apiVuelo.agregarVuelos(vuelo3);


        Hotel hotel = new Hotel("2020","02","Madrid");
        Hotel hotel2 = new Hotel("2020","02","Buenos Aires");
        Hotel hotel3 = new Hotel("2020","02","New York");


        ApiHotel apiHotel = new ApiHotel();
        apiHotel.agregarHoteles(hotel);
        apiHotel.agregarHoteles(hotel2);
        apiHotel.agregarHoteles(hotel3);


        Busqueda busqueda = new Busqueda(apiHotel,apiVuelo);
        busqueda.realizarBusqueda("2020","02","Madrid");

    }
}
