package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActorskAdapter(private val actors : List<Actor>)
    : RecyclerView.Adapter<ActorskAdapter.ActorViewHolder>(){

    inner class ActorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var pelicula = renglon.findViewById<TextView>(R.id.pelicula)
        var bio = renglon.findViewById<TextView>(R.id.bios)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.actors_renglon,parent, false)
        return ActorViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor = actors[position]
        holder.foto.setImageResource(actor.picture)
        holder.nombre.text = actor.nombre
        holder.pelicula.text = actor.pelicula
        holder.bio.text = actor.bio
        holder.itemView.setOnClickListener {
            val action = ActorskFragmentDirections.actionActorskFragmentToActorkFragment(actor)
            holder.itemView.findNavController().navigate(action)
        }
        /*holder.itemView.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_actorskFragment_to_actorkFragment, null)
        )*/

    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return actors.size
    }
}