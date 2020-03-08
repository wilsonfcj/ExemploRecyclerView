package br.edu.ifsc.exemplorecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import br.edu.ifsc.exemplorecyclerview.exemplocomactivity.RecyclerViewActivity
import br.edu.ifsc.exemplorecyclerview.exemplocomfragment.FragmentRecyclerViewActivty


/**
 * Objetivo desta classe:
 *  • Nesta tela nós vamos ter os botões para acessar a tela que mostrará uma Activity e em um Fragment usando o component RecyclerView.
 *  • Mostrar o básico de como adicionar componentes no xml e acessá-los para porder manipulalos.
 *
 *  Segundo Cordeiro, uma activity é um modelo independete que na maioria das vezes está relacionada a uma interfeca gráfica,
 *  que fica localizada dentro da pasta res > layout, a activity ficará responsável por gerenciar as ações para criar uma
 *  funcionalidade para o usuário do aplicativo [CORDEIRO 2016].
 *
 *  CORDEIRO, Felipe  (2016). O que é uma activity?. https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/.
 *  [Accessed: 07-03-2020].
 *
 *
 * Para criar uma activity vamos precisar usar os conceitos de orientão a objetos, herança e sobreescrita de métodos
 *
 * Na primeira linha de código (class MainActivity : AppCompatActivity()), temos a realização de uma herança, ou seja,
 * nossa MainActivity herda caracteristicas da classe AppCompatActivity()
 * .
 */
class MainActivity : AppCompatActivity() {

    var buttomActivityRecyclerView : Button? = null
    var buttomFragmentRecyclerView : Button? = null

    /**
     *
     * Conforme a documentação do android temos 6 callbacks que representam o ciclo de vida de uma Activity
     * [Desenvolvedores Android 2019], eles são:
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     * • onCreate
     * • onStart()
     * • onResume()
     * • onDestroy()
     * • onPause()
     * • onStop()
     *
     * Esses métodos podem ser executados para realizar uma ação conforme o ciclo de vida de sua tela executará.
     *
     **/

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
        setContentView(R.layout.activity_main)

        /**
         *
         * Métodos criados para referênciar os componentes e criar as ações dos componentes.
         *
         */
        mapearComponents()
        mapearAcoesComponents()

        // OBS.: se o layout em xml não estiver dentro de res>layout, não funcionará e poderá causar erro no aplicativo.
    }

    /**
     * onStart
     *
     * Quando a atividade insere o estado Iniciado, o sistema invoca esse callback.
     * Conforme a documentação, "A chamada onStart() torna a atividade visível ao usuário, à medida que o aplicativo prepara a atividade para inserir
     * o primeiro plano e se tornar interativa [Desenvolvedores Android 2019]."
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     **/
    override fun onStart() {
        super.onStart()
    }

    /**
     * onResume
     *
     * Conforme a documentação, "Quando a atividade insere o estado Retomado, ela vem para o primeiro plano e o sistema invoca
     * o callback onResume(). É nesse estado que o aplicativo interage com o usuário. O aplicativo é mantido nesse estado até
     * que algo ocorra e retire o foco do aplicativo. Um evento assim pode ser, por exemplo, o recebimento de uma chamada telefônica,
     * a navegação do usuário para outra atividade ou o desligamento da tela do dispositivo." [Desenvolvedores Android 2019]."
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     **/
    override fun onResume() {
        super.onResume()
    }

    /**
     * onDestroy
     *
     * Conforme a documentação, "A chamada onStart() torna a atividade visível ao usuário, à medida que o aplicativo prepara a atividade para inserir
     * o primeiro plano e se tornar interativa [Desenvolvedores Android 2019]."
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     **/
    override fun onDestroy() {
        super.onDestroy()
    }

    /**
     * onPause
     *
     * Conforme a documentação, "O sistema chama esse método como a primeira indicação de que o usuário está deixando sua atividade
     * (embora nem sempre signifique que a atividade esteja sendo destruída). Isso indica que a atividade não está mais em primeiro plano
     * (embora ainda possa estar visível se o usuário estiver no modo de várias janelas). Use o método onPause() para pausar ou ajustar
     * operações que não devem continuar (ou que precisem continuar com moderação) enquanto a Activity estiver no modo Pausado e aquelas que
     * você espera retomar em breve. [Desenvolvedores Android 2019]."
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     **/
    override fun onPause() {
        super.onPause()
    }

    /**
     * onStop
     *
     * Conforme a documentação, "Quando a atividade não estiver mais visível ao usuário, ela inserirá o estado Interrompido e o sistema
     * invocará o callback onStop(). Isso pode ocorrer, por exemplo, quando uma atividade recém-iniciada preenche toda a tela. O sistema
     * também poderá chamar onStop() quando a atividade parar de operar e estiver prestes a ser concluída. [Desenvolvedores Android 2019]."
     *
     * Android, Desenvolvedores (2019). Entenda o ciclo de vida da atividade.
     * https://www.androidpro.com.br/blog/desenvolvimento-android/activity-intro/. [Accessed: 07-03-2020].
     *
     **/
    override fun onStop() {
        super.onStop()
    }



    /**
     * para ficar mais simples vamos criar o métdo mapearComponents, que ficará responsavel por referênciar os componentes do layout em .xml
     * activity_main, que está armazenado em res > layout
     *
     * **/
    fun mapearComponents() {
        // Como usamos um thema que cria uma Action bar automatica,
        // não precisamos criar manualmente como no projeto do cancro.
        //
        supportActionBar!!.title = "Exemplo Recycler View"

        /**
         * com o método findViewById que conseguimos usar através da herança feita com a AppCompatActivity,
         * vamos referência um componente que esteja dentro da tela que definimos no setContetView que foi chamado
         * dentro do método onCreate.
         *
         * CUIDADO.: se o id do compoente for de outro layout diferente do qual foi definido no setContentView, e depois
         * o desenvolvedor for definir algum evento ou coletar algum valor do componente, vai dar nullpointer,
         * pois esse id não está no layout.
         *
         * OBS.: se tentar definir o mesmo id para mais de um componente do mesmo tipo, exemplo:
         *
         * buttomActivityRecyclerView = findViewById( * R.id.button_activity_recycler_view * )
         * buttomFragmentRecyclerView = findViewById( * R.id.button_activity_recycler_view * )
         *
         * O segundo componente na ordem de criação (Sequêncial), neste caso buttomFragmentRecyclerView,  receberá a referência.
         *
        **/
        buttomActivityRecyclerView = findViewById(R.id.button_activity_recycler_view)
        buttomFragmentRecyclerView = findViewById(R.id.button_fragment_recycler_view)
    }

    /**
     *
     * Para ficar mais simples vamos criar o métdo mapearAcoesComponents, que ficará responsavel por criar as ações dos componentes referenciados
     * no método mapearComponents()
     *
     * **/
    fun mapearAcoesComponents() {
        /**
         * Para criar um evento em kotlin é igual em java, basta apenas chamar a variável de instância do seu componente, colocar um ponto
         * e chamar os eventos que exitem nele e que você vai utilizar. Exemplo:
         *
         * evento de quando o usuário toca o dedo o botão e retira rapidamente
         * buttomActivityRecyclerView?.setOnClickListener(View.OnClickListener {
         *
         * })
         *
         * evento de quando o usuário deixa o dedo pressionando o botão por um tempo
         * buttomActivityRecyclerView?.setOnLongClickListener(View.OnLongClickListener {
         *
         * })
         *
         * **/
        buttomActivityRecyclerView?.setOnClickListener(View.OnClickListener {
            // Abrir tela com uma activity lista de imagens
            var intent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
            startActivity(intent)
        })

        buttomFragmentRecyclerView?.setOnClickListener(View.OnClickListener {
            // Abrir tela com uma activity que possuí um fragment com uma lista de imagens
            var intent = Intent(this@MainActivity, FragmentRecyclerViewActivty::class.java)
            startActivity(intent)
        })
    }
}
