package br.edu.ifsc.exemplorecyclerview.exemplocomactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsc.exemplorecyclerview.InformacaoUtil
import br.edu.ifsc.exemplorecyclerview.R
import br.edu.ifsc.exemplorecyclerview.adapter.InformacoesAdapter
import br.edu.ifsc.exemplorecyclerview.modelos.Informacao

/**
 * Objetivo desta classe:
 *  • Nesta tela nós vamos mostrar uma lista de informações em um recyclerView
 */
class RecyclerViewActivity : AppCompatActivity() {

    /**
     *
     * Variaveis globais da nossa tela
     *
     */
    var recyclerView : RecyclerView? = null
    var adpterLista : InformacoesAdapter? = null

    /**
     * onCreate é um método usado para configurar a interface de usuário, e definir, qual layout será mostrado, eventos de componentes
     * e outras funcionalidaes caso sejam necessárias.
     *
     **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * setContentView é o método que passamos como parametro um layout(pode ser um objeto do tipo view ou um arquivo em xml)
         * para ele ser exibido ao abrir uma tela.
         *
         **/
        setContentView(R.layout.activity_recycler_view)
        supportActionBar!!.title = "Exemplo Activity"
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
        recyclerView = findViewById(R.id.recycler_view)
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
        val mLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        // definindo a as configurações de exibição da lista
        recyclerView?.setLayoutManager(mLayoutManager)
        // Animação caso a lista tenha
        recyclerView?.setItemAnimator(DefaultItemAnimator())
        // definindo o adaptador que criará cada item da lista dinamicamente.
        recyclerView?.setAdapter(adpterLista)
    }
}