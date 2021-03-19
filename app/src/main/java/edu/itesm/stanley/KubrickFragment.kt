package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_kubrick.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [KubrickFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KubrickFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kubrick, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        movies.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_kubrickFragment_to_moviesFragment)
        )

        actors.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_kubrickFragment_to_actorskFragment)
        )

        /*movies.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_kubrickFragment_to_moviesFragment)
        }
        actors.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_kubrickFragment_to_actorskFragment)
        }
         */
    }


}