package ListSimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import org.iesch.a05_dashboard_menu.R;

import java.util.ArrayList;

public class albumActivity extends AppCompatActivity {


    // 9 - Me declaro el ListView y el Adaptador
    private ListView lvPeliculas;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        // 10 - Lo enlazo
        lvPeliculas = findViewById(R.id.lvLista);
        adaptador = new Adaptador(obtenerListaPeliculas(), this);
        // 12 - Asignamos el adaptador al listView
        lvPeliculas.setAdapter(adaptador);



    }
    // 11 - Me creo un metodopara obtener la lista de peliculas
    private ArrayList<Pelicula> obtenerListaPeliculas(){
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        listaPeliculas.add(new Pelicula(R.drawable.bleach,"BLEW","1989","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.yhlqmdlg,"ABOUT A GIRL","1989","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.x100pre,"BLOOM","1991","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.oasis,"Breed","1991","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.raro,"RAPE ME","1993","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.porfiado,"BLOOM","1991","NIRVANA"));
        listaPeliculas.add(new Pelicula(R.drawable.nevermind,"LO BUENO DE SER MALO","2006","CUARTETO DE NOS"));
        listaPeliculas.add(new Pelicula(R.drawable.raro,"CASA DE DAMIAN","2006","CUARTETO DE NOS"));
        listaPeliculas.add(new Pelicula(R.drawable.raro,"HOY ESTOY RARO","2006","CUARTETO DE NOS"));
        listaPeliculas.add(new Pelicula(R.drawable.badbunny,"DESPUÉS DE LA PLAYA","2022","BAD BUNNY"));



        return listaPeliculas;
    }
}
