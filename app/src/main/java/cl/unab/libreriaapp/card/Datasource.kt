package cl.unab.libreriaapp.card

import cl.unab.libreriaapp.R

class Datasource {
    fun loadCards(): List<Card> {
        return listOf<Card>(
            Card(R.string.libro_titulo_1, R.drawable.card_img_1, R.string.libro_descripcion_1),
            Card(R.string.libro_titulo_2, R.drawable.card_img_2, R.string.libro_descripcion_2),
            Card(R.string.libro_titulo_3, R.drawable.card_img_3, R.string.libro_descripcion_3)
        )
    }
}