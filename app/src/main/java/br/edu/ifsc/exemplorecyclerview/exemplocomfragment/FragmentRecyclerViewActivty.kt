package br.edu.ifsc.exemplorecyclerview.exemplocomfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import br.edu.ifsc.exemplorecyclerview.R
/**
 * Objetivo desta classe:
 *  • Nesta tela nós vamos adicionar os componentes necessários para poder trabalhar com fragment
 *  • Mostrar um fragment com uma lista de informações, semelhantes a RecyclerViewActivity
 */
class FragmentRecyclerViewActivty : AppCompatActivity() {

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
        setContentView(R.layout.activity_fragment)

        supportActionBar!!.title = "Exemplo Fragment"

        // Definindo qual layout fragment será iniciado na tela
        val androidFragment = RecyclerViewFragment()
        // método que define e realiza a troca dos fragments
        setDefaultFragment(androidFragment);
    }

    // This method is used to set the default fragment that will be shown.
    private fun setDefaultFragment(defaultFragment: Fragment) {
        replaceFragment(defaultFragment)
    }

    /**
     *
     * Substitue o fragmento atual pelo fragmento de destino.
     */
    fun replaceFragment(destFragment: Fragment?) { // First get FragmentManager object.
        val fragmentManager: FragmentManager = this.supportFragmentManager
        //Iniciar transação de fragment.
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        // Componente que exibirá os fragments caso tenha mais de um
        fragmentTransaction.replace(R.id.frame_layout_fragment, destFragment!!)
        // Aplica e realiza a transção de um fragment
        fragmentTransaction.commit()
    }
}

