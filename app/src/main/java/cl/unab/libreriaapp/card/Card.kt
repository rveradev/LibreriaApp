package cl.unab.libreriaapp.card

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Card(
    @StringRes val titleResourceId: Int,
    @DrawableRes val imgResourceId: Int,
    @StringRes val descriptionResourceId: Int
): Parcelable