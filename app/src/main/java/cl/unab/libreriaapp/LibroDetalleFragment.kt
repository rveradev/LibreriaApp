package cl.unab.libreriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class LibroDetalleFragment : Fragment() {

    private val args: LibroDetalleFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_libro_detalle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val libroSeleccionado = args.libroSeleccionado

        val btnVovler = view.findViewById<Button>(R.id.libro_btn_volver)
        val detalleImagen = view.findViewById<ImageView>(R.id.libro_img)
        val detalleTitulo = view.findViewById<TextView>(R.id.libro_titulo)
        val detalleDescripcion = view.findViewById<TextView>(R.id.libro_descripcion)

        btnVovler.setOnClickListener {
            findNavController().popBackStack()
        }

        detalleImagen.setImageResource(libroSeleccionado.imgResourceId)
        detalleTitulo.text = context?.resources?.getString(libroSeleccionado.titleResourceId)
        detalleDescripcion.text = context?.resources?.getString(libroSeleccionado.descriptionResourceId)
    }

}