package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_dps_single.*
import kotlinx.android.synthetic.main.fragment_dps_single.foto
import kotlinx.android.synthetic.main.fragment_dps_single.titulo

/**
 * A simple [Fragment] subclass.
 * Use the [DPSSingleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DPSSingleFragment : Fragment() {

    private val args by navArgs<DPSSingleFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dps_single, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.ffxivjob.picture)
        titulo.text = args.ffxivjob.name
        type.text = args.ffxivjob.type
        description.text = args.ffxivjob.description
    }
}