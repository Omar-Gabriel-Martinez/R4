
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.martinez_orozco.r2_v2.R

class MiAdaptador(private val datos: List<String>) :
    RecyclerView.Adapter<MiAdaptador.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textoItem: TextView = view.findViewById(R.id.texto_item)
        val lottieAnimation: LottieAnimationView = view.findViewById(R.id.lottieAnimation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista, parent, false)
        return ItemViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textoItem.text = datos[position]

        // Opcional: Personalizar la animación
        holder.lottieAnimation.setAnimation(R.raw.jan) // Nombre del archivo en raw/
        holder.lottieAnimation.playAnimation() // Iniciar animación
    }

    override fun getItemCount() = datos.size
}