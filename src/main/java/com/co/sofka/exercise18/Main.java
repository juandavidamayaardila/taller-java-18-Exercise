package com.co.sofka.exercise18;

import com.co.sofka.messages.Message;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase Main que permite inicializar la aplicación.
 *
 * @author CW-DV-JDAA
 * @version 02.03.003 29/05/2022
 * @since 01.
 */
public class Main {
    /**
     * Instancia de la clase encargada de mostrar los mensajes
     */
    static Message messages = Message.getInstance();

    public static void main(String[] args) {

        List<Series> listSeries = new ArrayList<>();
        List<Videojuego> listVideoGame = new ArrayList<>();
        Videojuego videoJuegoTmp = new Videojuego();
        Series seriesTemp = new Series();

        listSeries.add(new Series("Casa de papel", 6, "Accion", "Juan A"));
        listSeries.add(new Series("the mentalist", 12, "Accion", "marvel"));
        listSeries.add(new Series("The good doctor", 123, "Medico", "Disney"));
        listSeries.add(new Series("Bridgerton", 56, "Drama", "netflix"));
        listSeries.add(new Series("Brujas", 34, "Occio", "amazon"));

        listVideoGame.add(new Videojuego("FIFA", 10, "deportes", "Sport"));
        listVideoGame.add(new Videojuego("Mario kart", 6, "aventura", "Tencet"));
        listVideoGame.add(new Videojuego("Minecreaff", 67, "aventura", "Rlot games"));
        listVideoGame.add(new Videojuego("Crash team", 17, "Carreras", "Sypercell"));
        listVideoGame.add(new Videojuego("Mario Party", 4, "mision", "Epic games"));


        listSeries.stream().limit(3).forEach(Series::deliver);
        listSeries.stream().limit(1).forEach(Series::unDelivered);
        listVideoGame.stream().limit(4).forEach(Videojuego::deliver);


        messages.showMessage("*******************Numero de series prestadas**************");
        int countDeliverSeries = (int) listSeries.stream().filter(Series::isDelivered).count();
        messages.showMessage(String.valueOf(countDeliverSeries));
        messages.showMessage("*******************Numero de Video Juegos prestadas**************");
        int countDeliverVideoGame = (int) listVideoGame.stream().filter(Videojuego::isDelivered).count();
        messages.showMessage(String.valueOf(countDeliverVideoGame));

        messages.showMessage("*******************Video juego con mas horas estimadas**************");
        messages.showMessage(videoJuegoTmp.compareTo(listVideoGame).toString());

        messages.showMessage("*******************Series con mas Temporadas estimadas**************");
        messages.showMessage(seriesTemp.compareTo(listSeries).toString());

    }
}
