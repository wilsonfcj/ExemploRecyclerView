package br.edu.ifsc.exemplorecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsc.exemplorecyclerview.R
import br.edu.ifsc.exemplorecyclerview.modelos.Informacao

/**
 * Esse adaptador poderá ser usado em recyclerViews
 *
 * Objetivo desta classe:
 *  • Gerenciar lista de informações para mostrar as informações na tela
 *  • Para cada item contido na lista informacoes, será criado um item na interface para representalo
 *
 * @param resourcesID - Esse atributo é o layout que a nossa lista vai mostrar, é possível definir direto on ele é utilizado
 * @param informacoes - lista de informação para mostrar na tela
 *
 * */
class InformacoesAdapter (private val resourcesID: Int,
                          private val informacoes : List<Informacao>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     *
     * Define qual layout será exibido em cada item da lista. Uma lista pode ter varios layouts diferentes.
     *
     **/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val lView = LayoutInflater.from(parent.context)
            .inflate(resourcesID, parent, false)
        return ViewHolder(lView)
    }

    /**
     *
     * Para criar os itens da lista é necessário informar definir nossa lista neste método para ele criar todos os itens
     *
     **/
    override fun getItemCount(): Int {
        return informacoes.size
    }

    /**
     * Mostrando as informações no componente, conforme o indice e o item selecionado na lista
     **/
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // pega o item da lista para mostrar na posicao recebida no método onBindViewHolder.
        val lItem = informacoes[position]
        holder as ViewHolder
        holder.txtInfoDescricao.text = lItem.descicao
        holder.imageInfo.setImageResource(lItem.imagem!!)
    }


    // Classe responsavel por mapear os componentes que serão usados em cada layout
    inner class ViewHolder(aView : View) : RecyclerView.ViewHolder(aView) {
        val txtInfoDescricao : TextView = aView.findViewById(R.id.text_view_descricao)
        val imageInfo : ImageView = aView.findViewById(R.id.image_view_image)
    }

}