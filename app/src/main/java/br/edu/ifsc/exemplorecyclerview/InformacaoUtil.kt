package br.edu.ifsc.exemplorecyclerview

import br.edu.ifsc.exemplorecyclerview.modelos.Informacao

object InformacaoUtil {

//    Cria a lista de infromações para mostrar na tela, usada na activity RecyclerViewActivity e FragmentRecyclerViewActivity
    fun createListInformacao() : List<Informacao> {
        val list: MutableList<Informacao> = ArrayList()
        list.add(
            createInformcao(
                "Situação do Cancro Europeu da Macieira em Santa Catarina",
                R.drawable.imagem_sc
            )
        )
        list.add(
            createInformcao(
                "Importância",
                R.drawable.imagem_importancia
            )
        )
        list.add(
            createInformcao(
                "Histórico",
                R.drawable.imagem_historico
            )
        )
        list.add(
            createInformcao(
                "Etiologia",
                R.drawable.imagem_etiologia
            )
        )
        list.add(
            createInformcao(
                "Sintomatologia",
                R.drawable.imagem_sintomatologia
            )
        )
        list.add(
            createInformcao(
                "Epidemiologia",
                R.drawable.imagem_epidemiologia
            )
        )
        list.add(
            createInformcao(
                "Instrucação Normativa n°20",
                R.drawable.imagem_republica
            )
        )
        return list
    }

    private fun createInformcao(
        descricao: String,
        imagem: Int
    ): Informacao {
        val infos = Informacao()
        infos.descicao = descricao
        infos.imagem = imagem
        return infos
    }
}