package edu.itesm.stanley

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class DPSAdapter(private val dpsList : List<FFXIVJob>, var context: Context)
    : RecyclerView.Adapter<DPSAdapter.DPSViewHolder>(){

    inner class DPSViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var titulo = renglon.findViewById<TextView>(R.id.titulo)
        var tipo = renglon.findViewById<TextView>(R.id.tipo)
        var descripcion = renglon.findViewById<TextView>(R.id.descripcionsdsds)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DPSViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.dps_row,parent, false)
        return DPSViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: DPSViewHolder, position: Int) {
        val dps = dpsList[position]
        holder.foto.setImageResource(dps.picture)
        holder.titulo.text = dps.name
        holder.tipo.text = dps.type
        holder.descripcion.text = dps.description
        holder.itemView.setOnClickListener {

            val toast = Toast.makeText(context, "Entrando a " + dps.name, Toast.LENGTH_SHORT)
            toast.show()
            val action = DPSFragmentDirections.dpsFragmentToDpsDetailFragment(dps)
            holder.itemView.findNavController().navigate(action)
        }
    }

    // Cuantos elementos tiene la lista de jobs
    override fun getItemCount(): Int {
        return dpsList.size
    }
}