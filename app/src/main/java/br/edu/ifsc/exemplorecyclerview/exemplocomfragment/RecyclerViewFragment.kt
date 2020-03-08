package br.edu.ifsc.exemplorecyclerview.exemplocomfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsc.exemplorecyclerview.InformacaoUtil
import br.edu.ifsc.exemplorecyclerview.R
import br.edu.ifsc.exemplorecyclerview.adapter.InformacoesAdapter
import br.edu.ifsc.exemplorecyclerview.modelos.Informacao


class RecyclerViewFragment : Fragment() {

    /**
     *
     * Variaveis globais da nossa tela
     *
     */
    var recyclerView : RecyclerView? = null
    var adpterLista : InformacoesAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**
         *
         * Métodos criados para referênciar os componentes
         *
         */
        mapearComponentes()
    }

    /**
     * para ficar mais simples vamos criar o métdo mapearComponents, que ficará responsavel por referênciar os componentes do layout em .xml
     * activity_recycler_view, que está armazenado em res > layout
     *
     * **/
    fun mapearComponentes() {
        recyclerView = view!!.findViewById(R.id.recycler_view)
        configRecyclerView()
    }

    /**
     *
     * COnfigura a lista e adiciona os itens na lista
     *
     * **/
    private fun configRecyclerView() {
        // Cria o Lista com as informações
        val informacaoVideos: List<Informacao> =
            InformacaoUtil.createListInformacao()
        // Inicia o adaptador que cria cada item da lista conforme com o layout R.layout.list_item_info_normal
        adpterLista = InformacoesAdapter(R.layout.list_item_info_normal, informacaoVideos)

        // Definição de a nossa lista será exibida, em lista ou Grid
        val mLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        // definindo a as configurações de exibição da lista
        recyclerView?.setLayoutManager(mLayoutManager)
        // Animação caso a lista tenha
        recyclerView?.setItemAnimator(DefaultItemAnimator())
        // definindo o adaptador que criará cada item da lista dinamicamente.
        recyclerView?.setAdapter(adpterLista)
    }
}