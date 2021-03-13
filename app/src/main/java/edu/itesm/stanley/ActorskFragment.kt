package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*
import kotlinx.android.synthetic.main.fragment_movies.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [ActorskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actors_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActorsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val actors = ArrayList<Actor>()
        actors.add(Actor(R.drawable.duvall, "Shelley Duvalle", "71", "Shelley Alexis Duvall (n. Houston, Texas; 7 de julio de 1949) es una actriz retirada de cine y televisión, productora, escritora y cantante retirada estadounidense. "))
        actors.add(Actor(R.drawable.shell, "Shelley Winters", "Fallecida", "Shirley Schrift, más conocida como Shelley Winters (San Luis, Misuri, 18 de agosto de 1920-Beverly Hills, California, 14 de enero de 2006"))
        actors.add(Actor(R.drawable.gary, "Gary Lockwood", "Fallecido", "Gary Lockwood es un actor estadounidense nacido en 1937, conocido fundamentalmente por sus interpretaciones del astronauta Frank Poole en la película 2001"))
        actors.add(Actor(R.drawable.philip, "Philip Stone", "Fallecido", "Philip Stone (Kirkstall, Leeds, Yorkshire del Oeste; 14 de abril de 1924-Londres, 15 de junio de 2003), de nombre real Philip Stones, fue un actor británico de cine y televisión."))
        actors.add(Actor(R.drawable.jack, "Jack Nicholson", "83", "John Joseph «Jack» Nicholson (Neptune City, Nueva Jersey; 22 de abril de 1937) es un actor, productor, guionista y director de cine estadounidense retirado"))
        actors.add(Actor(R.drawable.vin, "Vincent D'Onofrio", "61", "Vincent D'Onofrio (Brooklyn, Nueva York, 30 de junio de 1959) es un actor y productor de cine estadounidense."))
        actors.add(Actor(R.drawable.tom, "Tom Cruise", "58", "homas Cruise Mapother IV (Siracusa, Nueva York; 3 de julio de 1962) más conocido como Tom Cruise, es un actor y productor de cine estadounidense ganador de tres premios Globo de Oro. "))
        actors.add(Actor(R.drawable.zac, "ZAC EFRON", "33", "Zack Efron comienza a recibir clases de canto a la edad de 11 años y realiza sus primeros pinitos como actor en sobre las tablas de un escenario en una fábula musical.  "))
        actors.add(Actor(R.drawable.jlo, "JENNIFER LOPEZ", "51", "Nacida en Puerto Rico, Jennifer López tomó clases de canto y baile desde los 5 años. Fue a los 18 años decide entrar en el mundo del espectáculo. Debutó en el cine con el filme 'My Family, Mi Familia'"))
        actors.add(Actor(R.drawable.matiu, "Matthew Modine", "61", "Matthew Modine (Loma Linda, California, 22 de marzo de 1959) es un actor y director estadounidense, ganador del Globo de Oro y de la Copa Volpi del Festival de Venecia."))
        actors.add(Actor(R.drawable.michael, "Michael Hordern", "Fallecido", "Michael Hordern (4 de octubre de 1911 – 2 de mayo de 1995) fue un actor inglés nombrado caballero en 1983 por sus servicios al teatro."))
        actors.add(Actor(R.drawable.pet, "Peter Sellers", "Fallecido", "Richard Henry Sellers, más conocido como Peter Sellers (Southsea, Hampshire, 8 de septiembre de 1925-Londres, 24 de julio de 1980), fue un actor y comediante británico. Fue investido miembro de la Orden del Imperio Británico."))
        actors.add(Actor(R.drawable.will,"Will Smith", "52","Will Smith estaba destinado a desarrollar su carrera en la música cuando, en 1989, conoció a Benny Medina, productor ejecutivo de Warner, quién le dio el papel principal en la serie de televisión 'El Príncipe de Bel-Air'. "))
        actors.add(Actor(R.drawable.roca, "DWAYNE JOHNSON", "48", "Dwayne Johnson crece en el seno de una familia de luchadores profesionales y, desde muy niño, su vida parece destinada a desarrollarse en el mundo del deporte."))

        return actors
    }

}