import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.saborcasa.R

class MainActivity : AppCompatActivity() {

    private val listaDePratos = listOf(
        Prato("Prato 1"),
        Prato("Prato 2"),
        Prato("Prato 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayoutPratos = findViewById<LinearLayout>(R.id.linearlayoutPratos)

        listaDePratos.forEach { prato ->
            val itemView = layoutInflater.inflate(R.layout.item_prato, null)

            // Configurar o TextView com o nome do prato
            val tvNomePrato = itemView.findViewById<TextView>(R.id.tvNomePrato)
            tvNomePrato.text = prato.nome

            // Configurar os botões de adicionar e remover
            val btnAddPrato = itemView.findViewById<Button>(R.id.btnAddPrato)
            val btnRemoverPrato = itemView.findViewById<Button>(R.id.btnRemoverPrato)

            // Configurar os listeners dos botões
            btnAddPrato.setOnClickListener {
                // Lógica para adicionar o prato à conta
                // Aqui você pode implementar a lógica para adicionar o prato à conta
            }

            btnRemoverPrato.setOnClickListener {
                // Lógica para remover o prato da conta
                // Aqui você pode implementar a lógica para remover o prato da conta
            }

            // Adicionar o item da lista ao LinearLayout
            linearLayoutPratos.addView(itemView)
        }
    }
}

data class Prato(val nome: String)
