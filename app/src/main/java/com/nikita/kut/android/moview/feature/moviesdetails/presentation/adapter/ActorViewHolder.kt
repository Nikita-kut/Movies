package com.nikita.kut.android.moview.feature.moviesdetails.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nikita.kut.android.moview.databinding.ItemActorBinding
import com.nikita.kut.android.moview.feature.moviesdetails.model.Actor

class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemActorBinding.bind(view)

    fun bind(actor: Actor) {
        Glide.with(itemView)
            .load(actor.actorPicture)
            .dontAnimate()
            .into(binding.ivActorPicture)
        binding.tvActorName.setText(actor.actorName)
    }

}