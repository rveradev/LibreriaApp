package cl.unab.libreriaapp.card

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.unab.libreriaapp.R
import com.google.android.material.button.MaterialButton

class CardAdapter(
    private val context: Context,
    private val dataset: List<Card>,
    private val onButtonClick: (Card) -> Unit
): RecyclerView.Adapter<CardAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.card_title)
        val imageView: ImageView = view.findViewById(R.id.card_img)
        val descriptionTextView: TextView = view.findViewById(R.id.card_description)
        val button: MaterialButton = view.findViewById(R.id.card_btn)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val card = dataset[position]
        holder.titleTextView.text = context.resources.getString(card.titleResourceId)
        holder.imageView.setImageResource(card.imgResourceId)
        holder.descriptionTextView.text = context.resources.getString(card.descriptionResourceId)

        holder.button.setOnClickListener {
            onButtonClick(card)
        }
    }

    override fun getItemCount() = dataset.size
}