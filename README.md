1 - criando novo projeto

* Nome
* nome do pacote
* local da pasta do projeto
* linguagem e SDK mínimo

2 - explicando a IDE (explicação e organização das pastas)

* Manifests 
	-> AndroidManifest.xml
* Java
	-> pasta principal, contém os códigos (kotlin ou java) do nosso projeto
	-> `androidTest` (testes que rodam no dispositivos)
	-> `test` (testes que rodam no pc)
* res
	-> drawable (ícones, imagens)
	-> layout (layout de todas as telas do app)
* values (cor, string, dark e light theme)
* gradle scripts 
* `build.gradle` (project) 
	`build.gradle` (module) aqui add as dependências para novas bibliotecas

3 - configurando emulador e celular físico

* AVD manager (emulador)
	- create virtual device
	- escolher um modelo (preferencia aos que têm ícone da play store)
	- escolher API level
* no dispositivo físico, é necessário cabo USB e que a opção de desenvolvedor esteja ativada
  * após ativar o modo desenvolvedor, volte na lista das configurações, procure a opção de 'opções do desenvolvedor' e confere se a 'depuração USB' está ativa


4- mexendo no layout (arquivos .xml)
* editor visual (opção design no canto superior direito)
  * Pallette (lado esquerdo do editor visual) contém vários tipos de componentes: botões, textos, tipos de layout etc, só procurar oq quer e arrastar pro retângulo branco no meio do editor
  * Attributes (lado direito do editor visual) lá é possível mudar o tamanho, cor, centralizar, margem etc
* Código (opção code no canto superior direito) 
  * Escrever na mão todos os componentes e seus atributos
* editor visual + código (opção split no canto superior direito)
* Constraint Layout: é um modo para estruturar e organizar os componentes da tela. Todo componente colocado dentro do `constraintLayout`, precisará que adicione os constraints (cima, baixo e lados), ancorando nas bordas da tela ou em outro componente

5 - adicionando e manipulando componentes

* `Text View` (componente para apresentação de textos)
	-> adicionado as constraints (topo e lados ancorados na borda da tela)
	-> mudança do nome ID para `tvNome`
* `Edit Text` (componente para dar input de textos)
  * adicionado as constraints (topo ancorado ao `Text View` `tvNome` e lados ancorados na borda da tela)
  * mudança do nome ID para `etNome`
  * adicionado Hint `"Insira o seu nome..."`
* Botão
  * adicionado as constraints (topo ancorado ao `EditText` `edNome` e lados ancorados na borda da tela)
  * mudança do nome ID para `btnEnviar`
  * mudando `Text` do botão para `"Enviar"`

6 - mudança no Nome do app

* Pelas pastas: res > layout > `strings`

* Atalho: pressionando Shift 2x, e escrevendo `string`

* quando acessar o arquivo de `strings` aparecerá: (só colocar o nome que quiser, no lugar de `???`
	`<string name="app_name">???</string>`

7 - acessando o `TextView` `tvNome`

* usando `findViewById<TextView>(R.id.tvNome)` é possível acessar o componente que adicionamos no layout
* entre `<>` colocamos o TIPO do componente (se é um botão, um `TextView`, `EditText` etc)
* entre `()` acessamos o id que adicionamos no nosso componente
* usando uma variável, podemos salvar a referência para esse componente, para mudarmos seus atributos posteriormente
	ex: `val tvNome = findViewById<TextView>(R.id.tvNome)`
* mudando o texto do componente:
	`tvNome.text = "Novo texto"``
	* `tvNome` é a variável que salvamos no item anterior
	* `.text` podemos acessar o atributo do componente
	* usando `= "Novo texto"` podemos trocar o texto do componente para o valor dentro de aspas

8 - eventos de clique

1. usando a variável `tvNome` que criamos, podemos usar `.setOnclickListener` para fazer eventos de clique

  ```kotlin
  tvNome.setOnClickListener {
      tvNome.text = "Novo texto"
  }
  ```

2. quando clicar em cima do componente `tvNome`, o `setOnClickListener` vai detectar o clique e irá executar tudo o que está dentro de `{ }`.

9 - Exercício de fixação

* Detectar um evento no botão enviar
* Pegar o texto presente no EditText do Nome
* Alterar o texto do TextView com o esse texto do EditText

Resolução:

- é necessário criar uma varável para cada componente

  ```kotlin
  val tvNome = findViewById<TextView>(R.id.tvNome)
  val btEnviar = findViewById<Button>(R.id.btEnviar)
  val etNome = findViewById<EditText>(R.id.etNome)
  ```

- mudar o `tvNome.setOnClickListener` para:
  	  `btEnviar.setOnClickListener { }`

- usando o que foi digitado para mostrar no texto
  	 
	```kotlin
	btEnviar.setOnClickListener {
      tvNome.text = etNome.text.toString()
	}
	```

10 - verificando se o `etNome` possui informação e exibindo erros de validação

```kotlin
if (etNome.text.isNotBlank()) {
    tvNome.text = etNome.text.toString()
} else {
    etNome.error = "Digite um nome válido!"
}
```

* como precisamos digitar um texto, para poder mostrá-lo depois, usando `etNome.text.isNotBlank()` podemos conferir se o campo não está em branco.
	- se não estiver em branco, pegamos o texto digitado e mostramos na tela
	- senão, o campo está em branco, e isso não é o que queremos quando clicamos no botão. Por isso, usamos `.error` para mostrar ao usuário que é para digitar algo: `"Digite um nome válido!"`

11 - Traduções do app

* antes de traduzir uma frase, é necessário que ela já esteja no arquivo de `strings`

* para adicionar uma frase no arquivo de `string`:
	- pelos arquivos de layout (`.xml`),
	  - procure sua frase e use `Alt + Enter`
	  - selecione a 1ª opção `Extract Resource`
	  - preencha os 2 campos da forma que desejar (o primeiro, resource name, é um `ID` pra frase, o segundo (`resource value`) é a frase em si)
	    - clique em ok
	    - segurando `Ctrl` e clicando em cima de `@string/insert_your_name`, acessamos o arquivo de `strings`
	      - OBS: o padrão do Android Studio já é inglês
* criando diretamente no arquivo de `strings`:
  	- Pelas pastas: `res > layout > strings`
  	- Atalho: pressionando `Shift` 2x, e escrevendo `string`
  	- crie sua `string` nesse formato:
  	`<string name=""></string>`
  	- adicionando os valores:
  	`<string name="insert_your_name">Insert your name...</string>`
* com o arquivo de `strings` aberto, no canto superior direito, selecione `Open Editor`

* no arquivo que abrir, procure um símbolo de mundo com um `+` verde, no canto superior esquerdo

* digite a língua ou país que deseja adicionar uma tradução e aperte `Enter`

* sua `string` aparecerá marcada de vermelho até que complete o campo vazio com o valor da tradução da língua que você escolheu, equivalente ao texto que colocou quando criou a `string` em inglês
exemplo da frase criada: `"Insert your name..."`
tradução da frase: `"Digite seu nome..."`