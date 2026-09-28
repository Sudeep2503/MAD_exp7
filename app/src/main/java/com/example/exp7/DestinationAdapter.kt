
package com.example.exp7
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DestinationAdapter(
    context: Context,
    private val destinations: List<Destination>
) : ArrayAdapter<Destination>(
    context, 0, destinations
) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_destination, parent, false)

        val destination = getItem(position)!!

        val image = view.findViewById<ImageView>(
            R.id.destinationImage
        )
        val name = view.findViewById<TextView>(
            R.id.destinationName
        )
        val description = view.findViewById<TextView>(
            R.id.destinationDescription
        )

        image.setImageResource(destination.imageResId)
        name.text = destination.name
        description.text = destination.description

        return view
    }
}