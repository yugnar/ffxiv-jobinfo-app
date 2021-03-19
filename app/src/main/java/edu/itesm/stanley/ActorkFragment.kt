package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.actors_renglon.*
import kotlinx.android.synthetic.main.fragment_actork2.*
import kotlinx.android.synthetic.main.fragment_actork2.foto

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [ActorkFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorkFragment : Fragment() {

    private val args by navArgs<ActorkFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actork2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.actor.picture)
        nombre_fragment.text = args.actor.nombre
        pelicula_fragment.text = args.actor.pelicula
        bios_fragment.text = args.actor.bio

    }
}