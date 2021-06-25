package com.nikita.kut.android.moview.feature.moviesdetails.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.util.inflate
import com.nikita.kut.android.moview.feature.moviesdetails.model.Actor

class ActorAdapter : RecyclerView.Adapter<ActorViewHolder>() {

    private val differ = AsyncListDiffer(this, ActorDiffUtilCallback())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder =
        ActorViewHolder(
            parent.inflate(
                R.layout.item_actor
            )
        )

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun updateList(newList: List<Actor>) {
        differ.submitList(newList)
    }
}