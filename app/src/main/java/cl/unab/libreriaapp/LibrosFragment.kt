package cl.unab.libreriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import cl.unab.libreriaapp.card.CardAdapter
import cl.unab.libreriaapp.card.Datasource

class LibrosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_libros, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Card Fragment
        val myDataset = Datasource().loadCards()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = CardAdapter(requireContext(), myDataset) {cardSeleccionada ->
            val action = LibrosFragmentDirections.actionLibrosToDetalle(cardSeleccionada)
            findNavController().navigate(action)
        }

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }
}