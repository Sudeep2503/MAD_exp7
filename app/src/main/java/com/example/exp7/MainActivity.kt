
package com.example.exp7
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(
            R.id.destinationList
        )
        val detailImage = findViewById<ImageView>(
            R.id.detailImage
        )
        val detailTitle = findViewById<TextView>(
            R.id.detailTitle
        )
        val detailDescription = findViewById<TextView>(
            R.id.detailDescription
        )

        val destinations = listOf(
            Destination(
                "Bengaluru",
                "The Garden City of India",
                R.drawable.bengaluru
            ),
            Destination(
                "Mysuru",
                "Famous for its royal heritage",
                R.drawable.mysuru
            ),
            Destination(
                "Goa",
                "Known for its beaches and tourism",
                R.drawable.goa
            ),
            Destination(
                "Manali",
                "A scenic Himalayan hill station",
                R.drawable.manali
            ),
            Destination(
                "Jaipur",
                "The Pink City of Rajasthan",
                R.drawable.jaipur
            )
        )

        val adapter = DestinationAdapter(
            this,
            destinations
        )

        listView.adapter = adapter

        listView.setOnItemClickListener {
                _, _, position, _ ->

            val selected = destinations[position]

            detailImage.setImageResource(
                selected.imageResId
            )
            detailTitle.text = selected.name
            detailDescription.text = selected.description
        }
    }
}